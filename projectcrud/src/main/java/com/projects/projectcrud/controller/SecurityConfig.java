package com.projects.projectcrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetails;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

        @Autowired
        private UserDetails userDetailsService;
    
        @Autowired
        public void configureGlobal(AuthenticationManagerBuilder build){
                build.userDetailsService( userDetailsService);
        }
        /*@Override
    protected void configure(AuthenticationManagerBuilder auth ) throws Exception {
            auth.inMemoryAuthentication()
                
            .withUser("admin")
            .password("{noop}1234")
            .roles("ADMIN","USER")
            .and()
            .withUser("user")
            .password("{noop}1234")
            .roles("USER")
            ;
    }*/



    /*@Override
    protected void configure(HttpSecurity http) throws Exception {
            http.authorizeRequests()
            .antMatchers("/crear-producto","/guardar","/eliminar","editar-producto")
            .hasRole("ADMIN")
            .antMatchers("/")
            .hasAnyRole("USER","ADMIN")
            .and()
            .formLogin()
            .loginPage("/login")
            ;
    }*/
}