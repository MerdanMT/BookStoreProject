package com.work4m.bookstoreproject.payment.service;

import com.work4m.bookstoreproject.payment.dto.request.PaymentCreateRequest;
import com.work4m.bookstoreproject.payment.dto.response.PaymentResponse;
import com.work4m.bookstoreproject.payment.entity.Payment;

import java.time.LocalDate;
import java.util.List;

public interface PaymentService {

    void createPayment(PaymentCreateRequest paymentCreateRequest);

    void deletePayment(Long id);

    Long totalPaymentCount();

    List<PaymentResponse> totalPaymentByUserId(Long fkUserId);

    Double totalPaymentQuantity();

    List<PaymentResponse> totalPaymentByBookId(Long fkBookId);

    List<PaymentResponse> totalPaymentDate(LocalDate beginDate);

    List<PaymentResponse> totalPaymentDateBetween(LocalDate beginDate, LocalDate endDate);

    List<PaymentResponse> totalPaymentByBookIdBetween(Long id,LocalDate beginDate, LocalDate endDate);

}
