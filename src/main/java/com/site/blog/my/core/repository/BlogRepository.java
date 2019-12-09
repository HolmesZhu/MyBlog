package com.site.blog.my.core.repository;

import com.site.blog.my.core.model.Blog;
import com.site.blog.my.core.util.PageQueryUtil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BlogRepository extends JpaRepository<Blog, Integer> {

    Blog findByBlogId(Long blogId);

    Blog findByBlogSubUrl(String blogSubUrl);

    @Query("")
    List<Blog> findByTypeAndLimit(int type, int limit);

    @Query
    List<Blog> findBlogList(PageQueryUtil pageUtil);

    @Query
    List<Blog> getBlogsPageByTagId(PageQueryUtil pageUtil);

}
