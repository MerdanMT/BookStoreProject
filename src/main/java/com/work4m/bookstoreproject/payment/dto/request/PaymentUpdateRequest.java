package com.work4m.bookstoreproject.payment.dto.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PaymentUpdateRequest {

    Long id;

    String currency;

    Double quantity;

    String cardNumber;

    LocalDate localDate;

    Long fkUserId;

    Long fkBookId;
}
