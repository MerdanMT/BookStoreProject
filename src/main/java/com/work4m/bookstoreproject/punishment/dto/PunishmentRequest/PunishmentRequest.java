package com.work4m.bookstoreproject.punishment.dto.PunishmentRequest;

import jakarta.persistence.Column;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PunishmentRequest {

    Long id;

    Long userId;

    Long bookId;

    Double price;
}
