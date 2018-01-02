package com.springboot.controller;

import com.springboot.domain.User;
import com.springboot.repository.UserRepository;
import com.springboot.requestbean.RequestUserBean;
import com.springboot.responsebean.ResponseUserBean;
import com.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserRepository userRepository;
    @Autowired
    UserService userService;

    /**
     * @return
     * @deprecated 查找
     */
    @GetMapping("/getall")
    public List<User> findall() {
        return userRepository.findAll();
    }

    /**
     * @param id
     * @deprecated 根据id查找
     * @return
     */
    @GetMapping("/getall/{id}")
    public List<User> findallbyid(@PathVariable("id") Integer id) {
        return userRepository.findAllById(id);
    }

    /**
     * @param request
     * @return
     * @deprecated 增添
     */
    @PostMapping("/adduser")
    public ResponseUserBean adduser(@RequestBody RequestUserBean request) {
        return userService.addUser(request);
    }
}
