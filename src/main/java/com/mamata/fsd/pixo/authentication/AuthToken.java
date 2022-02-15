package com.mamata.fsd.pixo.authentication;

public class AuthToken {

    public String token;
    public String username;

    public AuthToken(String token, String username) {
        this.token = token;
        this.username = username;
    }
}
