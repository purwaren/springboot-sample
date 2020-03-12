package com.pusilkom.demo.service;

import com.pusilkom.demo.dto.table.UsersItem;
import com.pusilkom.demo.security.CustomUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private UsersService usersService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UsersItem user = usersService.getUsersItemByUsername(username);

        GrantedAuthority grantedAuthority = new SimpleGrantedAuthority("ROLE_"+user.getRole().toUpperCase());
        Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
        authorities.add(grantedAuthority);

        CustomUser userDetail =  new CustomUser(user.getUsername(), user.getPassword(), authorities);
        userDetail.id = user.getId();
        userDetail.institusiId = user.getInstitusiId();
        return userDetail;
    }
}
