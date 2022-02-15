package com.mamata.fsd.domain;

import org.springframework.security.core.userdetails.UserDetails;

@DDD.DomainService
public interface IdentitySupplier {

    UserDetails get();
}
