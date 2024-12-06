package com.work4m.bookstoreproject.user.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserResponseDto {

    String fullName;

    String userName;

    String email;

    String phoneNumber;

    String address;

}
