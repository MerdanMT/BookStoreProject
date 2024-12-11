package com.work4m.bookstoreproject.admin.service.serviceImpl;

import com.work4m.bookstoreproject.admin.dto.request.AdminCreateRequest;
import com.work4m.bookstoreproject.admin.dto.request.AdminUpdateRequest;
import com.work4m.bookstoreproject.admin.dto.response.AdminResponse;
import com.work4m.bookstoreproject.admin.entity.Admin;
import com.work4m.bookstoreproject.admin.mapper.AdminMapper;
import com.work4m.bookstoreproject.admin.repository.AdminRepository;
import com.work4m.bookstoreproject.admin.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {

    private final AdminRepository adminRepository;
    private final AdminMapper adminMapper;

    @Override
    public void createAdmin(AdminCreateRequest adminCreateRequest) {

        Admin admin = adminMapper.toAdmin(adminCreateRequest);
        adminRepository.save(admin);
    }

    @Override
    public void updateAdmin(Long id, AdminUpdateRequest adminUpdateRequest) {

        Admin admin = adminRepository.findById(id).orElseThrow(null);

        adminRepository.save(adminMapper.toAdmin(admin, adminUpdateRequest));
    }

    @Override
    public void deleteAdmin(Long id) {

        adminRepository.deleteById(id);
    }

    @Override
    public AdminResponse findAdminById(Long id) {

        Admin admin = adminRepository.findById(id).orElseThrow(null);

        return adminMapper.toAdminResponse(admin);
    }

    @Override
    public List<AdminResponse> findAllAdmins() {

        return adminRepository.findAll().stream().map(adminMapper::toAdminResponse).toList();
    }
}
