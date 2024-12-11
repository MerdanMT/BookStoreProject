package com.work4m.bookstoreproject.payment.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PaymentResponse {

    String currency;

    Double quantity;

    Long fkUserId;

    String cardNumber;

    LocalDate localDate;

    Long fkBookId;
}
