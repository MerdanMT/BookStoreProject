package com.work4m.bookstoreproject.sale.repository;

import com.work4m.bookstoreproject.sale.dto.response.SaleResponseDto;
import com.work4m.bookstoreproject.sale.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {

    List<SaleResponseDto> findBySaleDateBetween(LocalDate startDate, LocalDate endDate);

    List<SaleResponseDto> findByUserId(Long userId);

    List<SaleResponseDto> findBySalesmanId(Long salesmanId);


}
