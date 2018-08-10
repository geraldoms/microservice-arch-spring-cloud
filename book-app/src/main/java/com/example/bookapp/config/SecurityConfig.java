package com.example.bookapp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private static final String BASE_URL = "/books";
    private static final String ADMIN_ROLE = "ADMIN";

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {

        auth.inMemoryAuthentication();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
            .authorizeRequests()
                .antMatchers(HttpMethod.GET).permitAll()
                .antMatchers(HttpMethod.POST, BASE_URL).hasRole(ADMIN_ROLE)
                .antMatchers(HttpMethod.PUT, BASE_URL + "/*").hasRole(ADMIN_ROLE)
                .antMatchers(HttpMethod.DELETE, BASE_URL).hasRole(ADMIN_ROLE)
                .anyRequest().authenticated()
                .and()
            .csrf()
                .disable();
    }

}
