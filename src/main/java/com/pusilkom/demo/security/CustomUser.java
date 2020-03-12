package com.pusilkom.demo.security;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;


@Data
public class CustomUser extends User {
    public Long id;
    public Long institusiId;

    public CustomUser(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
    }
}
