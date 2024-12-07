package com.work4m.bookstoreproject.rent.service;

import com.work4m.bookstoreproject.rent.dto.requestDto.RentCreateRequestDto;
import com.work4m.bookstoreproject.rent.dto.requestDto.RentUpdateRequestDto;
import com.work4m.bookstoreproject.rent.dto.responseDto.RentResponseDto;
import com.work4m.bookstoreproject.rent.entity.Rent;

import java.util.List;

public interface RentService {

    RentResponseDto findById(Long id);

    void save(RentCreateRequestDto rentCreateRequestDto);

    void delete(Long id);

    void update(Long id, RentUpdateRequestDto rentUpdateRequestDto);

    List<RentResponseDto> findAll();
}

