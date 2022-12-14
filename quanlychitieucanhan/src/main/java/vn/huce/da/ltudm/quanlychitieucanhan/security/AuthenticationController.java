/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.huce.da.ltudm.quanlychitieucanhan.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vn.huce.da.ltudm.quanlychitieucanhan.entity.User;
import vn.huce.da.ltudm.quanlychitieucanhan.repository.UserRepository;

/**
 *
 * @author Ngoc Long
 */
@CrossOrigin
@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    @Autowired
    UserRepository userRepository;

    @CrossOrigin
    @PostMapping("/login")
    public ResponseEntity<?> login(
            @RequestParam(value = "username", defaultValue = "") String username,
            @RequestParam(value = "password", defaultValue = "") String password) {
        User user = userRepository.findOne(username);
        if (user != null) {
            return new ResponseEntity<>(user, HttpStatus.valueOf(200));
        } else {
            return new ResponseEntity<>(null, HttpStatus.valueOf(404));
        }
    }

    @CrossOrigin
    @PostMapping("/register")
    public ResponseEntity<?> post(@RequestBody User input) {
        userRepository.save(input);
        return new ResponseEntity<>(null, HttpStatus.valueOf(201));
    }
}
