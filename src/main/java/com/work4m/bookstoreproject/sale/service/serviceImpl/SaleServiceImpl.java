package com.work4m.bookstoreproject.sale.service.serviceImpl;

import com.work4m.bookstoreproject.sale.dto.request.SaleCreateRequestDto;
import com.work4m.bookstoreproject.sale.dto.request.SaleUpdateRequestDto;
import com.work4m.bookstoreproject.sale.dto.response.SaleResponseDto;
import com.work4m.bookstoreproject.sale.entity.Sale;
import com.work4m.bookstoreproject.sale.service.SaleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleServiceImpl implements SaleService {

    @Override
    public void save(SaleCreateRequestDto saleCreateRequestDto) {

    }

    @Override
    public SaleResponseDto findById(Long id) {
        return null;
    }

    @Override
    public List<SaleResponseDto> findAll() {
        return List.of();
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void update(Long id, SaleUpdateRequestDto saleUpdateRequestDto) {

    }
}
