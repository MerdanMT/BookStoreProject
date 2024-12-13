package com.work4m.bookstoreproject.payment.service.ServiceImpl;

import com.work4m.bookstoreproject.payment.dto.request.PaymentCreateRequest;
import com.work4m.bookstoreproject.payment.dto.response.PaymentResponse;
import com.work4m.bookstoreproject.payment.entity.Payment;
import com.work4m.bookstoreproject.payment.mapper.PaymentMapper;
import com.work4m.bookstoreproject.payment.repository.PaymentRepository;
import com.work4m.bookstoreproject.payment.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepository paymentRepository;
    private final PaymentMapper paymentMapper;

    @Override
    public void createPayment(PaymentCreateRequest paymentCreateRequest) {

        Payment payment1 = paymentMapper.toPayment(paymentCreateRequest);
        paymentRepository.save(payment1);
    }

    @Override
    public void deletePayment(Long id) {

    }

    @Override
    public Long totalPaymentCount() {

        return paymentRepository.findAll().stream().count();
    }

    @Override
    public List<PaymentResponse> totalPaymentByUserId(Long fkUserId) {

        return paymentRepository.findByFkUserId(fkUserId).stream().map(paymentMapper::toPaymentResponse).toList();
    }

    @Override
    public Double totalPaymentQuantity() {

        Double d = 0.0;
        List<Payment> payments = paymentRepository.findAll();
        for (Payment payment : payments) {
            d += payment.getQuantity();
        }
        return d;
    }

    @Override
    public List<PaymentResponse> totalPaymentByBookId(Long fkBookId) {

        return paymentRepository.findByFkBookId(fkBookId).stream().map(paymentMapper::toPaymentResponse).toList();
    }

    @Override
    public List<PaymentResponse> totalPaymentDate(LocalDate beginDate) {

        List<Payment> payments = paymentRepository.findAll().stream().filter(
                s->s.getLocalDate().isEqual(beginDate)).toList();

        return payments.stream().map(paymentMapper::toPaymentResponse).toList();
    }

    @Override
    public List<PaymentResponse> totalPaymentDateBetween(LocalDate beginDate, LocalDate endDate) {

        List<Payment> payment = paymentRepository.findAll();
        List<PaymentResponse> paymentResponses = new ArrayList<>();
        for (Payment payment1 : payment) {
            if (payment1.getLocalDate().getDayOfMonth() >= beginDate.getDayOfMonth()
                    && payment1.getLocalDate().getDayOfMonth() <= endDate.getDayOfMonth()) {
                paymentResponses.add(paymentMapper.toPaymentResponse(payment1));
            }
        }
        return paymentResponses;
    }

    @Override
    public List<PaymentResponse> totalPaymentByBookIdBetween(Long id, LocalDate beginDate, LocalDate endDate) {
        List<Payment> payments = paymentRepository.findByFkBookId(id).stream().filter(
                a->a.getLocalDate().isAfter(beginDate)&& a.getLocalDate().isBefore(endDate)).toList();

        return payments.stream().map(paymentMapper::toPaymentResponse).toList();
    }
}
