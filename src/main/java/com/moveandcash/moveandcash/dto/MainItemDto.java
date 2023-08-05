package com.moveandcash.moveandcash.dto;

import com.moveandcash.moveandcash.entity.Member;
import com.querydsl.core.annotations.QueryProjection;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MainItemDto {

    private Long id;

    private Float lastOfferedRate;

    private String repayOrgCode;

    private Float balanceAmt;

    private Member member;

    @QueryProjection
    public MainItemDto(Long id, Float lastOfferedRate, String repayOrgCode, Float balanceAmt, Member member) {
        this.id = id;
        this.lastOfferedRate = lastOfferedRate;
        this.repayOrgCode = repayOrgCode;
        this.balanceAmt = balanceAmt;
        this.member = member;
    }
}
