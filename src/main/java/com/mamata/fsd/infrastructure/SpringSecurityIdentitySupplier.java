package com.mamata.fsd.infrastructure;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.mamata.fsd.domain.IdentitySupplier;

@Component
public class SpringSecurityIdentitySupplier implements IdentitySupplier {

    @Override
    public UserDetails get() {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if(principal instanceof UserDetails) {
            return (UserDetails)principal;
        }
        throw new UsernameNotFoundException(principal.toString());
    }
}
