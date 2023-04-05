package com.itac.security.genericclient.bankresource.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class OpenFinanceSecurityConfig {

    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http

                .authorizeRequests()
                .antMatchers("/**").permitAll()
                .mvcMatchers("/transaction/**").access("hasAuthority('SCOPE_transaction.read')")
                .anyRequest().authenticated()
                .and()
                .oauth2ResourceServer()
                .jwt();
        return http.build();
    }



}
