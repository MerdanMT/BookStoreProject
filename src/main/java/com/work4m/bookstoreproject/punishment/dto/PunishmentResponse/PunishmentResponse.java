package com.work4m.bookstoreproject.punishment.dto.PunishmentResponse;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PunishmentResponse {

    Long id;

    Long userId;

    Long bookId;

    Double price;
}
