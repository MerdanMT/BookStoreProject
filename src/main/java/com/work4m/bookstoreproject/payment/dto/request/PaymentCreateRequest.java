package com.work4m.bookstoreproject.payment.dto.request;

import jakarta.persistence.Column;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PaymentCreateRequest {

    String currency;

    Double quantity;

    String cardNumber;

    LocalDate localDate;

    Long fkUserId;

    Long fkBookId;
}
