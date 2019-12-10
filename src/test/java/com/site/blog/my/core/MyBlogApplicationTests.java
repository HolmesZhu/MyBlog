package com.site.blog.my.core;

import com.site.blog.my.core.controller.vo.SimpleBlogListVO;
import com.site.blog.my.core.model.AdminUser;
import com.site.blog.my.core.repository.AdminUserRepository;
import com.site.blog.my.core.service.AdminUserService;
import com.site.blog.my.core.service.BlogService;
import com.site.blog.my.core.util.MD5Util;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyBlogApplicationTests {

    @Resource
    private AdminUserService adminUserService;

    @Resource
    private BlogService blogService;

    @Resource
    private AdminUserRepository adminUserRepository;


    @Test
    public void contextLoads() {
//        String userName = "admin";
//        String password = "123456";
//        AdminUser adminUser = adminUserService.login(userName, password);
//        if (adminUser == null) {
//            System.out.println("adminUser is null");
//        } else {
//            System.out.println("adminUser is not null");
//        }
//        Boolean result = adminUserService.updatePassword(1, "123456", "hbkzhu13579");
//        if (result) {
//            System.out.println("更新成功");
//        } else {
//            System.out.println("更新失败");
//        }

        List<SimpleBlogListVO> simpleBlogListVOS = blogService.getBlogListForIndexPage(1);
        System.out.println(simpleBlogListVOS.size());

    }

}
