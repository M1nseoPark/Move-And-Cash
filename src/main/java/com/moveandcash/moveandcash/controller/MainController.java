package com.moveandcash.moveandcash.controller;

import com.moveandcash.moveandcash.dto.MemberDto;
import com.moveandcash.moveandcash.entity.Member;
import com.moveandcash.moveandcash.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class MainController {

    private final MemberService memberService;

    @GetMapping(value = "/main")
    public String main(Model model, @AuthenticationPrincipal UserDetails userDetails) {
        String email = userDetails.getUsername();
        Member member = memberService.findMember(email);
        MemberDto memberDto = MemberDto.builder()
                .id(member.getId())
                .name(member.getName())
                .build();

        model.addAttribute("member", memberDto);
        return "main";
    }

    @GetMapping(value = "/guide")
    public String guide() {
        return "guide";
    }
}
