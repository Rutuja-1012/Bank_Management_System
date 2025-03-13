package com.pratham.RestUsingSql;

import jakarta.persistence.*;

@Entity
@Table(name = "My_Account")
public class Account {

    @Id
    private String accountNumber;

    private String accountName;

    // Default constructor is required by JPA
    public Account() {
    }

    // Parameterized constructor
    public Account(String accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
    }

    // Getters and Setters
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
