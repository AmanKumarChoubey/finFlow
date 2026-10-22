package com.finFlow.controller;

import com.finFlow.entity.Account;
import com.finFlow.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/accounts")
public class AccountController {
    private final AccountService accountService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Account create(@RequestBody Account request){
        return accountService.createAccount(request.getHolderName());
    }
    @GetMapping("/{id}")
    public Account getById(@PathVariable Long id){
        return accountService.getAcccount(id);
    }
    @GetMapping
    public List<Account> getAll(){
        return accountService.getAllAccounts();
    }
}
