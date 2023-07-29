package com.example.moveandcash.dto;

import lombok.Data;

import java.util.List;

@Data
public class BankRequestToken {

    private String code;
    private String client_id;
    private String client_secret;
    private String redirect_uri;
    private String grant_type;

    public void BankRequestToken(String client_id, String client_secret, String redirect_uri, String grant_type) {
        this.client_id = client_id;
        this.client_secret = client_secret;
        this.redirect_uri = redirect_uri;
        this.grant_type = grant_type;
    }
}
