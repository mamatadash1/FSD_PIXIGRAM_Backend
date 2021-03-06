package com.mamata.fsd.infrastructure.user;

import com.mamata.fsd.domain.DDD;
import com.mamata.fsd.domain.user.User;
import com.mamata.fsd.domain.user.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
@DDD.RepositoryImpl
@Primary
public class SdjUsers implements Users, UserDetailsService {

    @Autowired
    private UsersSdj usersSdj;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional<User> maybeUserFound = usersSdj.findById(userName);
        if(maybeUserFound.isPresent()) {
            return new org.springframework.security.core.userdetails.User(
                    maybeUserFound.get().getEmail(),
                    maybeUserFound.get().getPassword(),
                    getAuthority()
            );
        }
        throw new UsernameNotFoundException(userName);
    }

    @Override
    public User findOne(String userName) {
        return usersSdj.findById(userName).orElseThrow( () -> new UsernameNotFoundException(userName));
    }

    @Override
    public List<User> getAllUsers() {
        return usersSdj.findAll();
    }

    private List<SimpleGrantedAuthority> getAuthority() {
        return Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN"));
    }
}
