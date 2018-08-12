package com.example.discoveryserver.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private static final String SYSTEM_ROLE = "SYSTEM";

    @Autowired
    protected void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {

        auth.inMemoryAuthentication()
            .passwordEncoder(passwordEncoder())
            .withUser("discUser")
            .password(passwordEncoder().encode("secret"))
            .roles(SYSTEM_ROLE);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
            .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.ALWAYS).and()
            .requestMatchers().antMatchers("/eureka/**").and()
            .authorizeRequests()
                .antMatchers("/eureka/**").hasRole(SYSTEM_ROLE)
                .antMatchers(HttpMethod.GET, "/", "/health").permitAll()
                .anyRequest().denyAll().and()
            .httpBasic().and()
            .csrf().disable();
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
