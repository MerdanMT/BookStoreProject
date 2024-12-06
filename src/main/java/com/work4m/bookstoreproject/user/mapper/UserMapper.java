package com.work4m.bookstoreproject.user.mapper;

import com.work4m.bookstoreproject.user.dto.request.UserCreateRequestDto;
import com.work4m.bookstoreproject.user.dto.request.UserUpdateRequestDto;
import com.work4m.bookstoreproject.user.dto.response.UserResponseDto;
import com.work4m.bookstoreproject.user.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserResponseDto toUserResponseDto(User user);

    User toUser(UserCreateRequestDto userRequestDto);

    User toUser(@MappingTarget User user, UserUpdateRequestDto userUpdateRequestDto);
}
