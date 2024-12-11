package com.work4m.bookstoreproject.admin.service;

import com.work4m.bookstoreproject.admin.dto.request.AdminCreateRequest;
import com.work4m.bookstoreproject.admin.dto.request.AdminUpdateRequest;
import com.work4m.bookstoreproject.admin.dto.response.AdminResponse;
import com.work4m.bookstoreproject.admin.entity.Admin;

import java.util.List;

public interface AdminService {

    void createAdmin(AdminCreateRequest adminCreateRequest);

    void updateAdmin(Long id, AdminUpdateRequest adminUpdateRequest);

    void deleteAdmin(Long id);

    AdminResponse findAdminById(Long id);

    List<AdminResponse> findAllAdmins();
}
