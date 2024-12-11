package com.work4m.bookstoreproject.admin.mapper;

import com.work4m.bookstoreproject.admin.dto.request.AdminCreateRequest;
import com.work4m.bookstoreproject.admin.dto.request.AdminUpdateRequest;
import com.work4m.bookstoreproject.admin.dto.response.AdminResponse;
import com.work4m.bookstoreproject.admin.entity.Admin;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface AdminMapper {

    Admin toAdmin(AdminCreateRequest adminCreateRequest);

    Admin toAdmin(@MappingTarget Admin admin, AdminUpdateRequest adminUpdateRequest);

    AdminResponse toAdminResponse(Admin admin);
}
