package com.work4m.bookstoreproject.rent.service.rentServiceImpl;

import com.work4m.bookstoreproject.rent.dto.requestDto.RentCreateRequestDto;
import com.work4m.bookstoreproject.rent.dto.requestDto.RentUpdateRequestDto;
import com.work4m.bookstoreproject.rent.dto.responseDto.RentResponseDto;
import com.work4m.bookstoreproject.rent.entity.Rent;
import com.work4m.bookstoreproject.rent.mapper.RentMapper;
import com.work4m.bookstoreproject.rent.repository.RentRepository;
import com.work4m.bookstoreproject.rent.service.RentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RentServiceImpl implements RentService {

    private final RentRepository rentRepository;
    private final RentMapper rentMapper;


    @Override
    public RentResponseDto findById(Long id) {

        Rent rent = rentRepository.findById(id).orElse(null);

        return rentMapper.rentToRentResponseDto(rent);
    }

    @Override
    public void save(RentCreateRequestDto rentCreateRequestDto) {

        rentRepository.save(rentMapper.rentDtoToRent(rentCreateRequestDto));
    }

    @Override
    public void delete(Long id) {

        rentRepository.deleteById(id);
    }

    @Override
    public void update(Long id, RentUpdateRequestDto rentUpdateRequestDto) {

        Rent rent = rentRepository.findById(id).orElse(null);

        rentRepository.save(rentMapper.rentDtoToRent(rent, rentUpdateRequestDto));

    }

    @Override
    public List<RentResponseDto> findAll() {
        return rentRepository.findAll().stream().map(rentMapper::rentToRentResponseDto).toList();
    }
}
