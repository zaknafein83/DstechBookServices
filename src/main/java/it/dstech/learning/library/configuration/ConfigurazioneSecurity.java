package it.dstech.learning.library.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import it.dstech.learning.library.service.CustomUserDetailsService;
import it.dstech.learning.library.utility.Constants;

@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableWebSecurity
@Configuration
public class ConfigurazioneSecurity extends WebSecurityConfigurerAdapter {

	@Autowired
	private CustomUserDetailsService userDetailsService; 

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth.userDetailsService(userDetailsService).passwordEncoder(getPasswordEncoder());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests().antMatchers("/api").hasRole(Constants.ROLE_ADMIN).anyRequest().permitAll().and().formLogin()
				.permitAll().defaultSuccessUrl("/success.html").and().csrf().disable();
	}
	private PasswordEncoder getPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
