package com.work4m.bookstoreproject.punishment.service;

import com.work4m.bookstoreproject.punishment.dto.PunishmentRequest.PunishmentRequest;
import com.work4m.bookstoreproject.punishment.dto.PunishmentResponse.PunishmentResponse;
import com.work4m.bookstoreproject.punishment.entity.Punishment;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PunishmentService {

    void create(PunishmentRequest punishmentRequest);

    PunishmentResponse findById(Long id);

    List<PunishmentResponse> findAll();

    void delete(Long id);

    List<PunishmentResponse> getPunishmentsByUserId(Long userId); //Verilən istifadəçi ID-si üzrə bütün cəzaları tapmaq.

    List<PunishmentResponse> getPunishmentsByBookId(Long bookId); //Verilən kitab ID-si üzrə bütün cəzaları tapmaq.

    List<PunishmentResponse> getPunishmentsByPriceRange(Double minPrice, Double maxPrice); //Verilən qiymət aralığına görə cəzaları tapmaq.

    Double getTotalPunishmentAmount(); //Bütün cəzaların ümumi məbləğini hesablamaq.

    Long getPunishmentsCountByUserId(Long userId); //Verilən istifadəçi üçün cəza sayını tapmaq.

    Long getPunishmentsCountByBookId(Long bookId); //Verilən kitab üçün cəza sayını tapmaq.


}
