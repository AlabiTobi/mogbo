package africa.semicolon.mogbo.controller;

import africa.semicolon.mogbo.dto.requests.LoginRequest;
import africa.semicolon.mogbo.dto.requests.RegisterUserRequest;
import africa.semicolon.mogbo.dto.responses.LoginUserResponse;
import africa.semicolon.mogbo.dto.responses.RegisterUserResponse;
import africa.semicolon.mogbo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/users")
    public RegisterUserResponse register(@RequestBody RegisterUserRequest registerUserRequest) {
        return userService.registerUser(registerUserRequest);
    }
    @PostMapping("/login")
    public LoginUserResponse login(@RequestBody LoginRequest request)  {
        return userService.login(request);
 }
}
