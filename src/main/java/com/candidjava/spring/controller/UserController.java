package com.candidjava.spring.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.candidjava.spring.bean.User;
import com.candidjava.spring.service.UserService;

import java.io.File;
import java.io.IOException;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

@RestController
@RequestMapping(value = { "/user" })
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getUserById(@PathVariable("id") String id) {
        System.out.println("Fetching User with id " + id);
        String user = userService.findById(id);
        if (user == null) {
            System.out.println(" User with id " + user);
            return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
        }
        System.out.println("id " + user);
        return new ResponseEntity<String>(user, HttpStatus.OK);
    }
    
	 

	//  @GetMapping(value="/get", headers="Accept=application/json")
	//  public List<User> getAllUser() {	 
	//   List<User> tasks=userService.getUser();
	//   return tasks;
	
	 //}

	
	
	
	

}
