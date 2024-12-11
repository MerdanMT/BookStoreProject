package com.work4m.bookstoreproject.admin.dto.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AdminUpdateRequest {

    Long id;

    String fullName;

    String email;

    String password;

    String phone;

    String address;
}
