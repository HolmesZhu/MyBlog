package com.site.blog.my.core.repository;

import com.site.blog.my.core.model.AdminUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminUserRepository extends JpaRepository<AdminUser, Integer> {

    AdminUser findByLoginUserNameAndLoginPassword(String loginUserName, String loginPassword);

    AdminUser findByAdminUserId(Integer adminUserId);
}
