package africa.semicolon.mogbo.services;

import africa.semicolon.mogbo.dto.responses.LoginUserResponse;
import africa.semicolon.mogbo.model.User;
import africa.semicolon.mogbo.data.repository.UserRepository;
import africa.semicolon.mogbo.dto.requests.LoginRequest;
import africa.semicolon.mogbo.dto.requests.RegisterUserRequest;
import africa.semicolon.mogbo.dto.responses.RegisterUserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    @Override
    public RegisterUserResponse registerUser(RegisterUserRequest request) {
        User user = new User();
        user.setEmail(request.getEmail());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setPassword(request.getPassword());
        User savedUser = userRepository.save(user);
        RegisterUserResponse response = new RegisterUserResponse();
        response.setEmail(savedUser.getEmail());
        response.setPassword(savedUser.getPassword());
                return response;

    }
    public LoginUserResponse login(LoginRequest loginRequest){
        User user = userRepository.findByEmail(loginRequest.getEmail());
      if(user.getEmail().equals(loginRequest.getEmail())){
          if(user.getPassword().equals(loginRequest.getPassword())){
              LoginUserResponse response = new LoginUserResponse();
              response.setMessage("Welcome back");
              return response;
          } 

      }
      return null;
        }

    }


