package com.example.moveandcash.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class MemberFormDto {

    @NotBlank(message = "이메일은 필수 입력 값입니다.")
    @Email(message = "이메일 형식으로 입력해주세요.")
    private String email;

    @NotBlank(message = "비밀번호는 필수 입력 값입니다.")
    private String password;

    @NotBlank(message = "이름은 필수 입력 값입니다.")
    private String name;

    @NotBlank(message = "필수 입력 값입니다. 인증하기를 통해 토큰을 발급받아 주세요")
    private String accessToken;

    @NotBlank(message = "필수 입력 값입니다. 인증하기를 통해 토큰을 발급받아 주세요")
    private String refreshToken;

    @NotBlank(message = "필수 입력 값입니다. 인증하기를 통해 토큰을 발급받아 주세요")
    private String userSeqno;
}
