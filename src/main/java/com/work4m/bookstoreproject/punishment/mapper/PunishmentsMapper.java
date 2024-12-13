package com.work4m.bookstoreproject.punishment.mapper;

import com.work4m.bookstoreproject.punishment.dto.PunishmentRequest.PunishmentRequest;
import com.work4m.bookstoreproject.punishment.dto.PunishmentResponse.PunishmentResponse;
import com.work4m.bookstoreproject.punishment.entity.Punishment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PunishmentsMapper {

    Punishment toPunishment(PunishmentRequest punishmentRequest);

    PunishmentResponse toPunishmentResponse(Punishment punishment);
}
