package com.work4m.bookstoreproject.sale.mapper;

import com.work4m.bookstoreproject.sale.dto.request.SaleCreateRequestDto;
import com.work4m.bookstoreproject.sale.dto.request.SaleUpdateRequestDto;
import com.work4m.bookstoreproject.sale.dto.response.SaleResponseDto;
import com.work4m.bookstoreproject.sale.entity.Sale;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface SaleMapper {

    SaleResponseDto saleToSaleResponseDto(Sale sale);

    Sale saleDtoToSale(SaleCreateRequestDto saleCreateRequestDto);

    Sale saleDtoToSale(@MappingTarget Sale sale, SaleUpdateRequestDto saleUpdateRequestDto);
}
