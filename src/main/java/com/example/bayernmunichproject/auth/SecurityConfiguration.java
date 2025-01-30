package com.example.bayernmunichproject.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import static com.example.bayernmunichproject.auth.PermissionsEnum.*;
import static com.example.bayernmunichproject.auth.RoleEnum.ADMIN;
import static com.example.bayernmunichproject.auth.RoleEnum.USER;
import static org.springframework.http.HttpMethod.GET;
import static org.springframework.http.HttpMethod.POST;
import static org.springframework.http.HttpMethod.PUT;
import static org.springframework.http.HttpMethod.DELETE;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfiguration {
    private final AuthenticationFilter authfilter;
    private final AuthenticationProvider authenticationProvider;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
                .csrf((csrf) -> csrf.disable())
                .authorizeHttpRequests(authorize -> authorize
                        .requestMatchers("/api/v1/auth/**")
                        .permitAll()
//                        .requestMatchers("-/-/**").hasAnyRole(ADMIN.name(), USER.name())
//                        .requestMatchers(GET, "-/-/**").hasAnyAuthority(ADMIN_READ.name())
//                        .requestMatchers(POST, "-/-/**").hasAnyAuthority(ADMIN_CREATE.name())
//                        .requestMatchers(PUT, "-/-/**").hasAnyAuthority(ADMIN_UPDATE.name())
//                        .requestMatchers(DELETE, "-/-/**").hasAnyAuthority(ADMIN_DELETE.name())
//
//                        .requestMatchers("-/-/**").hasRole(ADMIN.name())
//                        .requestMatchers(GET, "-/-/**").hasAuthority(ADMIN_READ.name())
//                        .requestMatchers(POST, "-/-/**").hasAuthority(ADMIN_CREATE.name())
//                        .requestMatchers(PUT, "-/-/**").hasAuthority(ADMIN_UPDATE.name())
//                        .requestMatchers(DELETE, "-/-/**").hasAuthority(ADMIN_DELETE.name())
                        .anyRequest()
                        .authenticated())
                .sessionManagement(sess ->
                        sess.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .authenticationProvider(authenticationProvider)
                .addFilterBefore(authfilter, UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }
}
