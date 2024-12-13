package com.work4m.bookstoreproject.user.service;

import com.work4m.bookstoreproject.user.dto.request.UserCreateRequestDto;
import com.work4m.bookstoreproject.user.dto.request.UserUpdateRequestDto;
import com.work4m.bookstoreproject.user.dto.response.UserResponseDto;

import java.util.List;

public interface UserService {

    List<UserResponseDto> getAll();

    UserResponseDto findByUsername(String username);

    UserResponseDto findByEmail(String email);

    void create(UserCreateRequestDto userCreateRequestDto);

    void update(Long id, UserUpdateRequestDto userUpdateRequestDto);

    void delete(Long id);
}
