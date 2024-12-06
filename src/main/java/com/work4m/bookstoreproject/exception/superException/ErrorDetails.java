package com.work4m.bookstoreproject.exception.superException;

import java.time.LocalDateTime;

public record ErrorDetails(
        LocalDateTime timestamp,
        String message,
        String details
) {
}
