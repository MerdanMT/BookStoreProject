package com.work4m.bookstoreproject.admin.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AdminResponse {

    String fullName;

    String email;

    String phone;

    String address;
}
