package com.work4m.bookstoreproject.payment.controller;

import com.work4m.bookstoreproject.payment.dto.response.PaymentResponse;
import com.work4m.bookstoreproject.payment.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/payments")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @GetMapping
    public Long totalPaymentCount(){

        return paymentService.totalPaymentCount();
    }

    @GetMapping("/total-payment-user-id/{id}")
    public List<PaymentResponse> totalPaymentByUserId(@PathVariable Long fkUserId){

        return paymentService.totalPaymentByUserId(fkUserId);
    }

    @GetMapping("/total-payment-quantity")
    public Double totalPaymentQuantity(){

        return paymentService.totalPaymentQuantity();
    }

    @GetMapping("/total-payment-book-id/{id}")
    public List<PaymentResponse> totalPaymentByBookId(@PathVariable Long fkBookId){

        return paymentService.totalPaymentByBookId(fkBookId);
    }

    @GetMapping("/payment-date/{begin-date}")
    public List<PaymentResponse> totalPaymentDate(
            @PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)LocalDate beginDate){

        return paymentService.totalPaymentDate(beginDate);
    }

    @GetMapping("/total-payment-date-between/{begin-date}/{end-date}")
    public List<PaymentResponse> totalPaymentDateBetween(
            @PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate beginDate,
            @PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate){

        return paymentService.totalPaymentDateBetween(beginDate, endDate);
    }

    @GetMapping("/total-payment-date-between-book-id/{id}/{begin-date}/{end-date}")
    public List<PaymentResponse> totalPaymentByBookIdBetween(
            @PathVariable Long id,
            @PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate beginDate,
            @PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate){

        return paymentService.totalPaymentByBookIdBetween(id, beginDate, endDate);
    }

}
