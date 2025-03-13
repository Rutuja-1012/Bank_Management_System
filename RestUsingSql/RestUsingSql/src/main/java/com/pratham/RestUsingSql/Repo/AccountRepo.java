package com.pratham.RestUsingSql.Repo;

import com.pratham.RestUsingSql.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepo extends JpaRepository<Account,String> {
}
