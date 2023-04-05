package com.itac.security.genericclient.bankresource.controller;

import com.itac.security.genericclient.bankresource.model.Bank;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BankController {

    @GetMapping("/transaction/banks")
    public List<Bank> bankList(){

        return Arrays.asList(
                new Bank("001", "Banco Agrario"),
                new Bank("002", "Banka"),
                new Bank("003", "BBVA")
        );
    }
}
