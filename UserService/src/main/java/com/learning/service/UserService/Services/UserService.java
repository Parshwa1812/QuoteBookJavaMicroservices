package com.learning.service.UserService.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.service.UserService.DTOs.UpdateUserDTO;
import com.learning.service.UserService.DTOs.UserDTO;
import com.learning.service.UserService.Entity.User;
import com.learning.service.UserService.ExceptionHandler.UserNotFoundException;
import com.learning.service.UserService.Repository.UserRepository;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User addUser(UserDTO userDTO)
    {
        User user=new User();
        user.setId(UUID.randomUUID().toString());
        user.setEmail(userDTO.getEmail());
        user.setFName(userDTO.getFName());
        user.setLName(userDTO.getLName());
        user.setRole(userDTO.getRole());
        user.setPassword(userDTO.getPassword());
        user.setPhoneNumber(userDTO.getPhoneNumber());
        userRepository.save(user);
        
        user.setPassword(null);
        return user;
    }

    public List<UserDTO> getallusers()
    {
        List<User> users=userRepository.findAll();
        List<UserDTO> usersDto=new ArrayList<>();

        users.forEach(x->{
            UserDTO u=new UserDTO();
            u.setEmail(x.getEmail());
            u.setId(x.getId());
            u.setFName(x.getFName());
            u.setLName(x.getLName());
            u.setPhoneNumber(x.getPhoneNumber());
            u.setRole(x.getRole());
            usersDto.add(u);
        });

         return usersDto;
    }

	public UserDTO getUserById(String userId) {
		
		User user = userRepository.findById(userId)
                .orElseThrow(() -> new UserNotFoundException(userId));

		UserDTO u=new UserDTO();
        u.setEmail(user.getEmail());
        u.setId(user.getId());
        u.setFName(user.getFName());
        u.setLName(user.getLName());
        u.setPhoneNumber(user.getPhoneNumber());
        u.setRole(user.getRole());
		return u;
	}

	public UserDTO updateUser(UpdateUserDTO userDto, String userId) {
		User user = userRepository.findById(userId)
                .orElseThrow(() -> new UserNotFoundException(userId));
		if(user!=null)
		{
			user.setFName(userDto.getFName());
			user.setLName(userDto.getLName());
			user.setPassword(user.getPassword());
			userRepository.save(user);
			

			UserDTO u=new UserDTO();
	        u.setEmail(user.getEmail());
	        u.setId(user.getId());
	        u.setFName(user.getFName());
	        u.setLName(user.getLName());
	        u.setPhoneNumber(user.getPhoneNumber());
	        u.setRole(user.getRole());
			return u;
		}
		
		return null;
	}
}
