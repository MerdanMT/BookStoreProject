package com.work4m.bookstoreproject.sale.service.serviceImpl;

import com.work4m.bookstoreproject.sale.dto.request.SaleCreateRequestDto;
import com.work4m.bookstoreproject.sale.dto.request.SaleUpdateRequestDto;
import com.work4m.bookstoreproject.sale.dto.response.SaleResponseDto;
import com.work4m.bookstoreproject.sale.entity.Sale;
import com.work4m.bookstoreproject.sale.mapper.SaleMapper;
import com.work4m.bookstoreproject.sale.repository.SaleRepository;
import com.work4m.bookstoreproject.sale.service.SaleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SaleServiceImpl implements SaleService {

    private final SaleRepository saleRepository;
    private final SaleMapper saleMapper;

    @Override
    public void save(SaleCreateRequestDto saleCreateRequestDto) {

        Sale sale = saleMapper.saleDtoToSale(saleCreateRequestDto);

        saleRepository.save(sale);

    }

    @Override
    public SaleResponseDto findById(Long id) {

        return saleMapper.saleToSaleResponseDto(saleRepository.findById(id).orElse(null));
    }

    @Override
    public List<SaleResponseDto> findAll() {
       return saleRepository.findAll().stream().map(saleMapper::saleToSaleResponseDto).toList();
    }

    @Override
    public void delete(Long id) {

        saleRepository.deleteById(id);
    }

    @Override
    public void update(Long id, SaleUpdateRequestDto saleUpdateRequestDto) {

        Sale sale = saleRepository.findById(id).orElse(null);
        saleRepository.save(saleMapper.saleDtoToSale(sale, saleUpdateRequestDto));
    }

    @Override
    public List<SaleResponseDto> getSalesByDateRange(LocalDate startDate, LocalDate endDate) {

        return saleRepository.findBySaleDateBetween(startDate,endDate);
    }

    @Override
    public List<SaleResponseDto> getSalesByUserId(Long userId) {

        return saleRepository.findByUserId(userId);
    }

    @Override
    public List<SaleResponseDto> getSalesBySalesmanId(Long salesmanId) {

        return saleRepository.findBySalesmanId(salesmanId);
    }

    @Override
    public Double calculateTotalSaleAmount(Long saleId) {

        Sale sale = saleRepository.findById(saleId).orElse(null);

        if (sale == null) {
            return 0.0;
        }

        Double total = sale.getCount()*sale.getPrice();

        return total;
    }

    @Override
    public Double getTotalSalesAmount() {

        List<Sale> sales = saleRepository.findAll();

        return sales.stream().mapToDouble(s -> s.getCount() * s.getPrice()).sum();
    }
}
