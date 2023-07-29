package com.example.moveandcash.controller;

import com.example.moveandcash.dto.BankRequestToken;
import com.example.moveandcash.dto.BankResponseToken;
import com.example.moveandcash.dto.MemberFormDto;
import com.example.moveandcash.service.OpenBankService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@RequestMapping("/members")
@Controller
@RequiredArgsConstructor
public class MemberController {

    private final OpenBankService openBankService;

    @GetMapping(value="/new")
    public String memberForm(Model model) {
        model.addAttribute("memberFormDto", new MemberFormDto());
        return "member/memberForm";
    }

    // 토큰 요청
    @GetMapping("/auth/openbank/callback")
    public String getToken(BankRequestToken bankRequestToken, Model model){
        BankResponseToken token = openBankService.requestToken(bankRequestToken);
        model.addAttribute("bankReponseToken", token);
        log.info("bankReponseToken={}", token);
        return "main";
    }
}
