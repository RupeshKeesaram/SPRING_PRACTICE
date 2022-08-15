package com.practice.containers.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception
    {
//        Permits all requests, there won't be any default login & all
//        http.authorizeRequests().anyRequest().permitAll().and().formLogin().and().httpBasic();
//        return http.build();


//        Deny all requests inside web application
        http.authorizeRequests().anyRequest().denyAll().and().formLogin().and().httpBasic();
        return http.build();

    }
}
