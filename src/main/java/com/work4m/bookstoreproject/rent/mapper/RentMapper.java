package com.work4m.bookstoreproject.rent.mapper;

import com.work4m.bookstoreproject.rent.dto.requestDto.RentCreateRequestDto;
import com.work4m.bookstoreproject.rent.dto.requestDto.RentUpdateRequestDto;
import com.work4m.bookstoreproject.rent.dto.responseDto.RentResponseDto;
import com.work4m.bookstoreproject.rent.entity.Rent;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface RentMapper {

    Rent rentDtoToRent(RentCreateRequestDto rentCreateRequestDto);

    Rent rentDtoToRent(@MappingTarget Rent rent, RentUpdateRequestDto rentUpdateRequestDto);

    RentResponseDto rentToRentResponseDto(Rent rent);
}
