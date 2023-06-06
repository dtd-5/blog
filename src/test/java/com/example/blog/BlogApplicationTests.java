package com.example.blog;

import com.example.blog.eblog.service.impl.MPostServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BlogApplicationTests {

    @Autowired
    MPostServiceImpl postService;
    @Test
    void contextLoads() {
        postService.initIndexWeekRank();

    }



}
