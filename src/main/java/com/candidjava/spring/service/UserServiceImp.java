package com.candidjava.spring.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.candidjava.spring.bean.User;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

@Service
public class UserServiceImp implements UserService {

	private static List<User> users;

	public List<User> getUser() {
		// TODO Auto-generated method stub
		return users;
	}

	public String findById(String id) {
		ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
		try {
			User user = mapper.readValue(new File("/Users/sbalaj989/Downloads/yamlv1/src/main/resources/user.yaml"), User.class);
			//if (user.getName() == id) {
				return user.getRoles();
			//}
		}
	 	catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}	
		return null;
            
	}



}
