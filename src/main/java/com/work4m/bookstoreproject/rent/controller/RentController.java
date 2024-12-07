package com.work4m.bookstoreproject.rent.controller;

import com.work4m.bookstoreproject.rent.dto.requestDto.RentCreateRequestDto;
import com.work4m.bookstoreproject.rent.dto.requestDto.RentUpdateRequestDto;
import com.work4m.bookstoreproject.rent.dto.responseDto.RentResponseDto;
import com.work4m.bookstoreproject.rent.service.RentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/rents")
@RequiredArgsConstructor
public class RentController {

    private final RentService rentService;

    @GetMapping
    public List<RentResponseDto> findAll() {
        return rentService.findAll();
    }

    @GetMapping("{id}")
    public RentResponseDto findById(@PathVariable Long id) {
        return rentService.findById(id);
    }

    @PostMapping
    public void save(@RequestBody RentCreateRequestDto rentCreateRequestDto){

        rentService.save(rentCreateRequestDto);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){

        rentService.delete(id);
    }

    @PutMapping("{id}")
    public void update(@PathVariable Long id, @RequestBody RentUpdateRequestDto rentUpdateRequestDto){

        rentService.update(id, rentUpdateRequestDto);
    }
}
