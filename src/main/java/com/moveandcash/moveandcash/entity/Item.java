package com.moveandcash.moveandcash.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="mydata")
@Getter
@Setter
public class Item {

    @Id
    @Column(name="d_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="issue_date", nullable = false)
    private LocalDateTime issueDate;

    @Column(name="exp_date", nullable = false)
    private LocalDateTime expDate;

    @Column(name="last_offered_rate", nullable = false)
    private Float lastOfferedRate;

    @Column(name="repay_org_code", nullable = false)
    private String repayOrgCode;

    @Column(name="balance_amt", nullable = false)
    private Float balanceAmt;

    @Column(name="loan_principal", nullable = false)
    private Float loanPrincipal;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "m_id")
    private Member member;   // 판매자 정보
}
