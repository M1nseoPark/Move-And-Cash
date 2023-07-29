package com.example.moveandcash.service;

import com.example.moveandcash.dto.BankRequestToken;
import com.example.moveandcash.dto.BankResponseToken;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OpenBankService {

    private final OpenBankApiClient openBankApiClient;

    public BankResponseToken requestToken(BankRequestToken bankRequestToken) {
        return openBankApiClient.requestToken(bankRequestToken);
    }
}
