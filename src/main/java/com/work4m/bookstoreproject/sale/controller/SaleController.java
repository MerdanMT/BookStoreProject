package com.work4m.bookstoreproject.sale.controller;
import com.work4m.bookstoreproject.sale.dto.request.SaleCreateRequestDto;
import com.work4m.bookstoreproject.sale.dto.request.SaleUpdateRequestDto;
import com.work4m.bookstoreproject.sale.dto.response.SaleResponseDto;
import com.work4m.bookstoreproject.sale.service.SaleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/sales")
@RequiredArgsConstructor
public class SaleController {

    private final SaleService saleService;

    @GetMapping()
    public List<SaleResponseDto> findAll() {
        return saleService.findAll();
    }

    @GetMapping("/{id}")
    public SaleResponseDto findById(@PathVariable Long id) {
        return saleService.findById(id);
    }

    @PostMapping()
    public void create(@RequestBody SaleCreateRequestDto saleCreateRequestDto) {
        saleService.save(saleCreateRequestDto);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody SaleUpdateRequestDto saleUpdateRequestDto) {
        saleService.update(id, saleUpdateRequestDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        saleService.delete(id);
    }
}
