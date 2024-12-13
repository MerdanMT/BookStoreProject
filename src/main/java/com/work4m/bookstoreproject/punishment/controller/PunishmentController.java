package com.work4m.bookstoreproject.punishment.controller;

import com.work4m.bookstoreproject.punishment.dto.PunishmentRequest.PunishmentRequest;
import com.work4m.bookstoreproject.punishment.dto.PunishmentResponse.PunishmentResponse;
import com.work4m.bookstoreproject.punishment.service.PunishmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/punishments")
@RequiredArgsConstructor
public class PunishmentController {
    private final PunishmentService punishmentService;

    @PostMapping
    public void create(@RequestBody PunishmentRequest punishmentRequest){

        punishmentService.create(punishmentRequest);
    }

    @GetMapping("/find-by-id/{id}")
    public PunishmentResponse findById(@PathVariable Long id){

        return punishmentService.findById(id);
    }

    @GetMapping
    List<PunishmentResponse> findAll(){

        return punishmentService.findAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){

        punishmentService.delete(id);
    }

    @GetMapping("/get-punishments-by-user-id/{userId}")
    public List<PunishmentResponse> getPunishmentsByUserId(@PathVariable Long userId){

        return punishmentService.getPunishmentsByUserId(userId);
    }

    @GetMapping("/get-punishments-by-book-id/{bookId}")
    public List<PunishmentResponse> getPunishmentsByBookId(@PathVariable Long bookId){

        return punishmentService.getPunishmentsByBookId(bookId);
    }

    @GetMapping("/get-punishments-by-price-range/{minPrice}/{maxPrice}")
    public List<PunishmentResponse> getPunishmentsByPriceRange(
            @PathVariable Double minPrice, @PathVariable Double maxPrice){

        return punishmentService.getPunishmentsByPriceRange(minPrice, maxPrice);
    }

    @GetMapping("/get-total-punishment-amount")
    public Double getTotalPunishmentAmount(){

        return punishmentService.getTotalPunishmentAmount();
    }

    @GetMapping("/get-punishments-count-by-user-id/{userId}")
    public Long getPunishmentsCountByUserId(Long userId){

        return punishmentService.getPunishmentsCountByUserId(userId);
    }

    @GetMapping("/get-punishments-count-by-book-id/{bookId}")
    public Long getPunishmentsCountByBookId(Long bookId){

        return punishmentService.getPunishmentsCountByBookId(bookId);
    }
}
