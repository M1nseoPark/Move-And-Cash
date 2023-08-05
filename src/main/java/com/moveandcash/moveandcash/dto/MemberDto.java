package com.moveandcash.moveandcash.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class MemberDto {

    private Long id;

    private String name;

    @Builder
    public MemberDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}