package com.work4m.bookstoreproject.punishment.service.PunishmentServiceImpl;

import com.work4m.bookstoreproject.punishment.dto.PunishmentRequest.PunishmentRequest;
import com.work4m.bookstoreproject.punishment.dto.PunishmentResponse.PunishmentResponse;
import com.work4m.bookstoreproject.punishment.entity.Punishment;
import com.work4m.bookstoreproject.punishment.mapper.PunishmentsMapper;
import com.work4m.bookstoreproject.punishment.repository.PunishmentRepository;
import com.work4m.bookstoreproject.punishment.service.PunishmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PunismentServiceImpl implements PunishmentService {

    PunishmentRepository punishmentRepository;
    PunishmentsMapper punismentMapper;

    @Override
    public void create(PunishmentRequest punishmentRequest) {

        Punishment punishment1 = punismentMapper.toPunishment(punishmentRequest);

        punishmentRepository.save(punishment1);

    }

    @Override
    public PunishmentResponse findById(Long id) {

        Punishment punishment = punishmentRepository.findById(id).orElse(null);
        if (punishment == null) {
            return null;
        }
        return punismentMapper.toPunishmentResponse(punishment);
    }

    @Override
    public List<PunishmentResponse> findAll() {

        return punishmentRepository.findAll().stream().map(punismentMapper::toPunishmentResponse).toList();
    }

    @Override
    public void delete(Long id) {

        punishmentRepository.deleteById(id);
    }

    @Override
    public List<PunishmentResponse> getPunishmentsByUserId(Long userId) {

        List<PunishmentResponse> punishmentResponses = new ArrayList<>();
        List<Punishment> punishments = punishmentRepository.findAll()
                .stream()
                .filter(punishment -> punishment.getUserId().equals(userId))
                .toList();
        for (Punishment punishment : punishments) {
            punishmentResponses.add(punismentMapper.toPunishmentResponse(punishment));
        }
        return punishmentResponses;
    }

    @Override
    public List<PunishmentResponse> getPunishmentsByBookId(Long bookId) {

        List<PunishmentResponse> punishmentResponses = new ArrayList<>();
        List<Punishment> punishments = punishmentRepository.findAll()
                .stream()
                .filter(punishment -> punishment.getBookId().equals(bookId))
                .toList();
        for (Punishment punishment : punishments) {
            punishmentResponses.add(punismentMapper.toPunishmentResponse(punishment));
        }

        return punishmentResponses;
    }

    @Override
    public List<PunishmentResponse> getPunishmentsByPriceRange(Double minPrice, Double maxPrice) {

        List<PunishmentResponse> punishmentResponses = new ArrayList<>();
        List<Punishment> punishments = punishmentRepository.findAll()
                .stream()
                .filter(punishment -> punishment.getPrice() >= minPrice && punishment.getPrice() <= maxPrice)
                .toList();
        for (Punishment punishment : punishments) {
            punishmentResponses.add(punismentMapper.toPunishmentResponse(punishment));
        }
        return punishmentResponses;
    }

    @Override
    public Double getTotalPunishmentAmount() {

        List<Punishment> punishments = punishmentRepository.findAll();

        return punishments.stream()
                .mapToDouble(Punishment::getPrice)
                .sum();
    }

    @Override
    public Long getPunishmentsCountByUserId(Long userId) {

        return punishmentRepository.countByUserId(userId);
    }

    @Override
    public Long getPunishmentsCountByBookId(Long bookId) {

        return punishmentRepository.countByBookId(bookId);
    }
}
