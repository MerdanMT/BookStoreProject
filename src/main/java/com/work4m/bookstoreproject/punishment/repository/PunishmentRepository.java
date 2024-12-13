package com.work4m.bookstoreproject.punishment.repository;

import com.work4m.bookstoreproject.punishment.entity.Punishment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PunishmentRepository extends JpaRepository<Punishment, Long> {

    Long countByBookId(Long bookId);

    Long countByUserId(Long userId);

}
