package org.cigma.boutique.securityConfig;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfiguration extends WebSecurityConfigurerAdapter {

	public SpringSecurityConfiguration() {
		super();
	}
	@Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private DataSource dataSource;

  
    
	protected void configure(final HttpSecurity http) throws Exception{
		http
		
		.authorizeRequests()
        .antMatchers("/","/detailProduct","/About").permitAll()
        .antMatchers("/login").permitAll()
        .antMatchers("/registration").permitAll()
        .antMatchers("/Produit","/addProduit","home","/updateproduit").hasAuthority("ADMIN").anyRequest()
       
        .authenticated().and().csrf().disable().formLogin()
        .loginPage("/login").failureUrl("/login?error=true")
        .defaultSuccessUrl("/home")
        .usernameParameter("email")
        .passwordParameter("password")
        .and().logout()
        .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
        .logoutSuccessUrl("/").and().exceptionHandling()
        .accessDeniedPage("/access-denied");
}
	
	protected void configure(final AuthenticationManagerBuilder auth)throws Exception{
		 auth.
         jdbcAuthentication()
         .usersByUsernameQuery("select email, password, active from user where email=?")
         .authoritiesByUsernameQuery("select u.email, r.role from user u inner join user_role ur on(u.user_id=ur.user_id) inner join role r on(ur.role_id=r.role_id) where u.email=?")
         .dataSource(dataSource)
         .passwordEncoder(bCryptPasswordEncoder);
	}
	@Override
    public void configure(WebSecurity web) throws Exception {
        web
                .ignoring()
                .antMatchers("/resources/**", "/static/**", "/css/**", "/js/**", "/images/**","/fonts/**","/vendor/**");
}
}

