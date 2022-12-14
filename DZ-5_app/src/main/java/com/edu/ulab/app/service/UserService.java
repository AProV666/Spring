package com.edu.ulab.app.service;

import com.edu.ulab.app.dto.UserDto;
import org.springframework.stereotype.Repository;

@Repository
public interface UserService {
    UserDto createUser(UserDto userDto);

    UserDto updateUser(UserDto userDto);

    UserDto getUserById(Long id);

    Boolean deleteUserById(Long id);
}
