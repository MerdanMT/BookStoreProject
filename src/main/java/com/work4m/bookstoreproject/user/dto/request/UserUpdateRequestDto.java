package com.work4m.bookstoreproject.user.dto.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserUpdateRequestDto {
    Long id;

    String fullName;

    String userName;

    String email;

    String password;

    String phoneNumber;

    String address;
}
