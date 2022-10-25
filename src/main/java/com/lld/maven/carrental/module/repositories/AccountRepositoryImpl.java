package com.lld.maven.carrental.module.repositories;

import com.lld.maven.carrental.module.models.accounts.Account;
import com.lld.maven.carrental.module.repositories.interfaces.AccountRepository;

import java.util.Map;

public class AccountRepositoryImpl implements AccountRepository {
    Map<String, Account> accountMap;
    @Override
    public void add(Account account) {
        accountMap.putIfAbsent(account.getUserName(), account);
    }
}
