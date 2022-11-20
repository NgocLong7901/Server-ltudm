/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.huce.da.ltudm.quanlychitieucanhan.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vn.huce.da.ltudm.quanlychitieucanhan.entity.User;
import vn.huce.da.ltudm.quanlychitieucanhan.repository.UserRepository;
import vn.huce.da.ltudm.quanlychitieucanhan.service.UserService;

/**
 *
 * @author Ngoc Long
 */
@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/get/{id_user}")
    public Optional<User> get(@PathVariable Long id_user) {
        return userRepository.findById(id_user);
    }

    @GetMapping("/all")
    public List<User> list() {
        return userRepository.findAll();
    }

    @GetMapping("/get")
    public User getUser(@RequestParam String username) {
        return userRepository.findOne(username);
    }
}
