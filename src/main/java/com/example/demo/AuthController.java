package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AuthController {

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {
        // Verify email and password
        if ("test@example.com".equals(request.getEmail()) && "password".equals(request.getPassword())) {
            return "Login Successful";
        } else {
            throw new RuntimeException("Invalid credentials");
        }
    }

    @PostMapping("/signup")
    public String signup(@RequestBody SignupRequest request) {
        // Save user to the database
        return "Signup Successful";
    }
}

class LoginRequest {
    private String email;
    private String password;

    // Getter and Setter for email
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter and Setter for password
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}

class SignupRequest {
    private String name;
    private String email;
    private String password;

    // Getter and Setter for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for email
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter and Setter for password
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
