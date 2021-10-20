package io.nifa.user;

import io.nifa.user.dto.UserDTO;
import io.nifa.user.repository.UserRepository;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;

@Path("/users")
public class UserController {
    @Inject
    UserRepository userRepository;

    @GET
    public List<UserDTO> getUsers() {
        return UserDTO.fromUser(userRepository.getAllUsers());
    }
}
