package com.work4m.bookstoreproject.payment.mapper;

import com.work4m.bookstoreproject.payment.dto.request.PaymentCreateRequest;
import com.work4m.bookstoreproject.payment.dto.request.PaymentUpdateRequest;
import com.work4m.bookstoreproject.payment.dto.response.PaymentResponse;
import com.work4m.bookstoreproject.payment.entity.Payment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PaymentMapper {

    Payment toPayment(PaymentCreateRequest paymentCreateRequest);

    Payment toPayment(PaymentUpdateRequest paymentUpdateRequest);

    PaymentResponse toPaymentResponse(Payment payment);
}
