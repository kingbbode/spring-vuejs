package com.github.kingbbode.springbootvuejs.controller;

import com.github.kingbbode.springbootvuejs.dto.TodoResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RequestMapping("/user")
@RestController
public class TodoRestController {

    @GetMapping("/info/{id}")
    private TodoResponse getUserInfo(@PathVariable String id) {
        if("kingbbode".equals(id)) {
            return TodoResponse.builder()
                    .id("kingbbode")
                    .img("https://avatars3.githubusercontent.com/u/17121431?v=4")
                    .company("@zuminternet -> @woowabros")
                    .todoList(Arrays.asList("회사 적응", "개인 플젝 오픈"))
                    .build();
        }else if("jojoldu".equals(id)) {
            return TodoResponse.builder()
                    .id("jojoldu")
                    .img("https://avatars0.githubusercontent.com/u/7760496?v=4")
                    .company("@zuminternet -> @woowabros")
                    .todoList(Arrays.asList("초개모 번영", "광고비 많이 벌기", "책 제안받기", "강사 제안받기"))
                    .bio("기억보단 기록을..")
                    .build();
        }
        throw new IllegalArgumentException("하지마세요.");
    }
}
