package com.pratham.RestUsingSql.Controller;

import com.pratham.RestUsingSql.Account;
import com.pratham.RestUsingSql.Serive.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    @GetMapping
    public List<Account> getAllAAccountDetalis(){
      return accountService.getAllAccounts();
    }

    @PostMapping
    public String createAccount(Account account){
        accountService.createAccount(account);
        return "Account created";
    }

    @PutMapping
    public String updateAccount(Account account){
        return accountService.updateaccount(account);
    }


    @DeleteMapping("{accountNumber}")
    public String deleteAccount(@PathVariable String accountNumber){
        accountService.deleteAccount(accountNumber);
        return "Deleted";
    }


}
