package com.khotrizwan.angular8.services;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	//deeclare logger
	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		log.info("UserName: " + username);
		
		if ("TheTechTM".equals(username)) {
			//{"username":"TheTechTM","password":"password"}
			log.debug("User found with username: {}", username);
			return new User("TheTechTM", "$2a$10$slYQmyNdGzTn7ZLBXBChFOC9f6kFjAqPhccnP6DxlWXx2lPk1C3G6",
					new ArrayList<>());
		} else {
			log.debug("User not found with username: {}", username);
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
	}

}