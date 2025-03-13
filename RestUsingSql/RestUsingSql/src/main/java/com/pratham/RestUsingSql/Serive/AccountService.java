package com.pratham.RestUsingSql.Serive;

import com.pratham.RestUsingSql.Account;
import com.pratham.RestUsingSql.Repo.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService  {
    @Autowired
    AccountRepo accountRepo;

    public List<Account>getAllAccounts(){
       return accountRepo.findAll();
    }

    public String createAccount(Account account){
        accountRepo.save(account);
        return "Accont created";
    }



    public String updateaccount(Account account){
        accountRepo.save(account);
        return "Udated";
    }

    public boolean deleteAccount(String accountNumber){
        accountRepo.deleteById(accountNumber);
        return true;

    }
}
