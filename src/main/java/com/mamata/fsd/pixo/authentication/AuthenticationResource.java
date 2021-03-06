package com.mamata.fsd.pixo.authentication;

import com.mamata.fsd.config.JwtTokenUtil;
import com.mamata.fsd.domain.user.User;
import com.mamata.fsd.domain.user.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/token")
@CrossOrigin(origins = "*")
public class AuthenticationResource {

    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private Users users;

    @RequestMapping(value = "/generate-token", method = RequestMethod.POST)
    public AuthToken loginUser(@RequestBody LoginUser loginUser) throws AuthenticationException {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginUser.username, loginUser.password));
        User user = users.findOne(loginUser.username);
        String token = jwtTokenUtil.generateToken(user.getEmail());
        return new AuthToken(token, user.getEmail());
    }
}
