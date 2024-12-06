package com.work4m.bookstoreproject.user.service.userServiceImpl;

import com.work4m.bookstoreproject.exception.subException.NotFoundException.UserNotFoundException;
import com.work4m.bookstoreproject.user.dto.request.UserCreateRequestDto;
import com.work4m.bookstoreproject.user.dto.request.UserUpdateRequestDto;
import com.work4m.bookstoreproject.user.dto.response.UserResponseDto;
import com.work4m.bookstoreproject.user.entity.User;
import com.work4m.bookstoreproject.user.mapper.UserMapper;
import com.work4m.bookstoreproject.user.repository.UserRepository;
import com.work4m.bookstoreproject.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public List<UserResponseDto> getAll() {
        return userRepository.findAll().stream().map(userMapper::toUserResponseDto).toList();
    }

    @Override
    public UserResponseDto findByUsername(String username) {

        if(userRepository.findByUserName(username)==null) throw new UserNotFoundException("Not found "+username);

        return userRepository.findByUserName(username);
    }

    @Override
    public UserResponseDto findByEmail(String email) {

        if (userRepository.findByEmail(email)==null) throw new UserNotFoundException("Not found "+email);

       return userRepository.findByEmail(email);
    }

    @Override
    public void create(UserCreateRequestDto userCreateRequestDto) {

        User user = userMapper.toUser(userCreateRequestDto);
        userRepository.save(user);
    }

    @Override
    public void update(Long id, UserUpdateRequestDto userUpdateRequestDto) {

        User user = userRepository.findById(id).orElseThrow(()-> new UserNotFoundException("Not found user with id: " + id));
        userRepository.save(userMapper.toUser(user, userUpdateRequestDto));
    }

    @Override
    public void delete(Long id) {

        userRepository.deleteById(id);
    }
}
