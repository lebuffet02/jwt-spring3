package demojwt.jwt.service;

import demojwt.jwt.jwt.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    JwtService jwtService;

    public String generateToken(Authentication auth) {
        return jwtService.generateToken(auth);
    }
}