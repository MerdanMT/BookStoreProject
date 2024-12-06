package com.work4m.bookstoreproject.sale.service;

import com.work4m.bookstoreproject.sale.dto.request.SaleCreateRequestDto;
import com.work4m.bookstoreproject.sale.dto.request.SaleUpdateRequestDto;
import com.work4m.bookstoreproject.sale.dto.response.SaleResponseDto;
import com.work4m.bookstoreproject.sale.entity.Sale;

import java.util.List;

public interface SaleService {

    void save(SaleCreateRequestDto sale);

    SaleResponseDto findById(Long id);

    List<SaleResponseDto> findAll();

    void delete(Long id);

    void update(Long id, SaleUpdateRequestDto saleUpdateRequestDto);

}
