package com.example.moveandcash.service;

import com.example.moveandcash.dto.BankRequestToken;
import com.example.moveandcash.dto.BankResponseToken;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class OpenBankApiClient {

    private final HttpHeaders httpHeaders;
    private final RestTemplate restTemplate;

    @Value("${openbank.client_secret}")
    private String client_secret;
    private String redirect_uri = "http://localhost/auth/openbank/callback";

    public BankResponseToken requestToken(BankRequestToken bankRequestToken) {
        httpHeaders.add("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");

        bankRequestToken.BankRequestToken("448be003-c974-4c3a-920d-9f7dc079ba84", client_secret, redirect_uri, "authorization_code");

        MultiValueMap<String, String> parameters = new LinkedMultiValueMap<>();
        parameters.add("code",bankRequestToken.getCode());
        parameters.add("client_id",bankRequestToken.getClient_id());
        parameters.add("client_secret",bankRequestToken.getClient_secret());
        parameters.add("redirect_uri",bankRequestToken.getRedirect_uri());
        parameters.add("grant_type",bankRequestToken.getGrant_type());

        HttpEntity<MultiValueMap<String,String>> param = new HttpEntity<>(parameters, httpHeaders);

        return restTemplate.exchange("https://testapi.openbanking.or.kr/oauth/2.0/token", HttpMethod.POST, param, BankResponseToken.class).getBody();
    }

    public HttpHeaders setHeader(String access_token){
        httpHeaders.add("Authorization", "Bearer " + access_token);
        return httpHeaders;
    }
}
