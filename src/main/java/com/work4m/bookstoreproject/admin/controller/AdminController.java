package com.work4m.bookstoreproject.admin.controller;

import com.work4m.bookstoreproject.admin.dto.request.AdminCreateRequest;
import com.work4m.bookstoreproject.admin.dto.request.AdminUpdateRequest;
import com.work4m.bookstoreproject.admin.dto.response.AdminResponse;
import com.work4m.bookstoreproject.admin.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/v1/admins")
@RequiredArgsConstructor
public class AdminController {

    private final AdminService adminService;

    @PostMapping
    public void createAdmin(@RequestBody AdminCreateRequest adminCreateRequest){

        adminService.createAdmin(adminCreateRequest);
    }

    @PutMapping("/{id}")
    public void updateAdmin(@PathVariable Long id, @RequestBody AdminUpdateRequest adminUpdateRequest){

        adminService.updateAdmin(id, adminUpdateRequest);
    }

    @DeleteMapping("/{id}")
    public void deleteAdmin(Long id){

        adminService.deleteAdmin(id);
    }

    @GetMapping("/{id}")
    public AdminResponse findAdminById(Long id){

        return adminService.findAdminById(id);
    }

    @GetMapping
    public List<AdminResponse> findAllAdmins(){

        return adminService.findAllAdmins();
    }
}
