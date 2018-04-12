package com.github.kingbbode.springbootvuejs.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TodoResponse {
    private TodoInfo info;
    private List<String> todoList;

    @Builder
    public TodoResponse(String id, String img, String company, String bio, List<String> todoList) {
        this.info = TodoInfo.builder().id(id).company(company).img(img).bio(bio).build();
        this.todoList = todoList;
    }

    @Getter
    @Setter
    @Builder
    public static class TodoInfo {
        private String id;
        private String img;
        private String company;
        private String bio;
    }
}
