package com.lld.maven.carrental.module.models.accounts;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Account {
    private String email;
    private String name;
    private String userName;
}
