package com.example.demoapi.config;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

/**
 * @author hyh.
 * @version 1.0
 * @Date: 2021/6/9 17:47
 */
@Component
public class SelfUserDetailServiceImpl implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

        SelfUserDetails selfUserDetails = new SelfUserDetails(bCryptPasswordEncoder.encode("zjt"),"zjt",null,true,true,true,true);

        return selfUserDetails;
    }
}
