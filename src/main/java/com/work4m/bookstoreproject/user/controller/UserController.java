package com.work4m.bookstoreproject.user.controller;

import com.work4m.bookstoreproject.user.dto.request.UserCreateRequestDto;
import com.work4m.bookstoreproject.user.dto.request.UserUpdateRequestDto;
import com.work4m.bookstoreproject.user.dto.response.UserResponseDto;
import com.work4m.bookstoreproject.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public List<UserResponseDto> findAll() {
        return userService.getAll();
    }

    @GetMapping("/{email}")
    public UserResponseDto findByEmail(@PathVariable String email) {
        return userService.findByEmail(email);
    }

    @PostMapping
    public void create(@RequestBody UserCreateRequestDto userCreateRequestDto) {
        userService.create(userCreateRequestDto);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody UserUpdateRequestDto userUpdateRequestDto) {
        userService.update(id, userUpdateRequestDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        userService.delete(id);
    }
}
