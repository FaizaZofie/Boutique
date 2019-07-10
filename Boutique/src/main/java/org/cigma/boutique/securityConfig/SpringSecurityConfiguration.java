package org.cigma.boutique.securityConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.security.config.annotation.web.builders.WebSecurity;


import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfiguration extends WebSecurityConfigurerAdapter  {

	public SpringSecurityConfiguration() {
		super();
	}
	@Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private DataSource dataSource;
   
    protected void configure(final AuthenticationManagerBuilder auth)throws Exception{
		 auth.
        jdbcAuthentication()
        .usersByUsernameQuery("select username, password, active from user where username=?")
       .authoritiesByUsernameQuery("select user.username, role.role_id from user  inner join user_role on user.id=user_role.user_id inner join role  on user_role.role_id=role.role_id where user.username=?")
       .dataSource(dataSource);
       // .passwordEncoder(bCryptPasswordEncoder);
	}
    
	protected void configure(final HttpSecurity http) throws Exception{
		http
		
		.authorizeRequests()
        .antMatchers("/","/detailProduct","/About").permitAll()
        .antMatchers("/login").permitAll()
        .antMatchers("/registration").permitAll()
        .antMatchers("/Produit","/addProduit","/home","/updateproduit").access("hasRole('ADMIN')").anyRequest()
       
        .authenticated().and().csrf().disable()
        .formLogin()
        .loginPage("/login")
        .defaultSuccessUrl("/home")
        .failureUrl("/login?error=true")
        .usernameParameter("username")
        .passwordParameter("password")
        .and().logout()
        .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
        .logoutSuccessUrl("/").and().exceptionHandling()
        .accessDeniedPage("/access-denied");
		
}
	
	
	 @Override
	    public void configure(WebSecurity web) throws Exception {
		 web
                .ignoring()
                .antMatchers("/resources/**", "/static/**", "/css/**", "/js/**", "/images/**","/fonts/**","/vendor/**");
}
	 
}

