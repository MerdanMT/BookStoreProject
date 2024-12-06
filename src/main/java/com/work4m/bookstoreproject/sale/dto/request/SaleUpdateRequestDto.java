package com.work4m.bookstoreproject.sale.dto.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class SaleUpdateRequestDto {

    Long id;

    Long bookId;

    Long userId;

    Long salesmanId;

    LocalDateTime saleDate;

    Long count;

    Double price;

    Long discount;

    Long paymentId;
}
