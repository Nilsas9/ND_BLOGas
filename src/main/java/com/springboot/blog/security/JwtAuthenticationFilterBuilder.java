package com.springboot.blog.security;

import org.springframework.security.core.userdetails.UserDetailsService;

public class JwtAuthenticationFilterBuilder {
    private JwtTokenProvider jwtTokenProvider;
    private UserDetailsService userDetailsService;

    public JwtAuthenticationFilterBuilder setJwtTokenProvider(JwtTokenProvider jwtTokenProvider) {
        this.jwtTokenProvider = jwtTokenProvider;
        return this;
    }

    public JwtAuthenticationFilterBuilder setUserDetailsService(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
        return this;
    }

    public JwtAuthenticationFilter createJwtAuthenticationFilter() {
        return new JwtAuthenticationFilter(jwtTokenProvider, userDetailsService);
    }
}