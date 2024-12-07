package com.work4m.bookstoreproject.rent.dto.responseDto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class RentResponseDto {

    Long userId;

    Long bookId;

    LocalDate date;

    LocalDate defaultDate;
}
