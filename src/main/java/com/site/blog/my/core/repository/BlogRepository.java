package com.site.blog.my.core.repository;

import com.site.blog.my.core.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BlogRepository extends JpaRepository<Blog, Integer> {

    Blog findByBlogId(Long blogId);

    Blog findByBlogSubUrl(String blogSubUrl);

}
