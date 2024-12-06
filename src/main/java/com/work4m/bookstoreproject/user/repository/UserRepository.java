package com.work4m.bookstoreproject.user.repository;

import com.work4m.bookstoreproject.user.dto.response.UserResponseDto;
import com.work4m.bookstoreproject.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    UserResponseDto findByUserName(String username);

    UserResponseDto findByEmail(String email);
}
