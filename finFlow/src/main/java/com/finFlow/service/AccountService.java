package com.finFlow.service;

import com.finFlow.entity.Account;
import com.finFlow.exception.AccountNotFoundException;
import com.finFlow.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
@RequiredArgsConstructor
public class AccountService {
    private final AccountRepository accountRepository;

    //    Create Account logic
    public Account createAccount(String holderName){
        Account account=new Account();
        account.setHolderName(holderName);
        return accountRepository.save(account);
    }

    //   Fetch Account Holder
    public Account getAcccount(Long id){
        return accountRepository.findById(id)
                .orElseThrow(() -> new AccountNotFoundException(id));
    }

    //  Fetch All Account Holder
    public List<Account> getAllAccounts(){
        return accountRepository.findAll();
    }
}
