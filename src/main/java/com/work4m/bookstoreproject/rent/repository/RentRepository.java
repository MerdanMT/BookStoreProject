package com.work4m.bookstoreproject.rent.repository;

import com.work4m.bookstoreproject.rent.entity.Rent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentRepository extends JpaRepository<Rent, Long> {

}
