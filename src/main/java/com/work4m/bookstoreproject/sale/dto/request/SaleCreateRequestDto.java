package com.work4m.bookstoreproject.sale.dto.request;

import jakarta.persistence.Column;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class SaleCreateRequestDto {

    Long bookId;

    Long userId;

    Long salesmanId;

    LocalDateTime saleDate;

    Long count;

    Double price;

    Long discount;

    Long paymentId;
}
