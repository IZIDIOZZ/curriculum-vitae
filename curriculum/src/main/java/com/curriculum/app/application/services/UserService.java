package com.curriculum.app.application.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.curriculum.app.data.repositories.UserRepository;
import com.curriculum.app.domain.entities.User;
import com.curriculum.app.application.mappings.UserMapper;
import com.curriculum.app.application.viewModels.UserViewModel;

@Service
public class UserService {
	@Autowired 
	UserRepository _userRepository;
	
	public UserViewModel getUser(long id){
		User user = _userRepository.findById(id)
					.orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, 
															  	  "User Not Found"));
		
		return UserMapper.toMap(user);
	}
}
