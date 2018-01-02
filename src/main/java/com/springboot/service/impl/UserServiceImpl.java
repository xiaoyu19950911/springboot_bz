package com.springboot.service.impl;

import com.springboot.domain.User;
import com.springboot.repository.UserRepository;
import com.springboot.requestbean.RequestUserBean;
import com.springboot.responsebean.ResponseUserBean;
import com.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;

    @Override
    @Transactional//事物
    public ResponseUserBean addUser(RequestUserBean request) {
        User user=new User();
        user.setSex(request.getSex());
        user.setAddress(request.getAddress());
        user.setName(request.getName());
        ResponseUserBean responseUserBean=new ResponseUserBean();
        responseUserBean.setBody(userRepository.saveAndFlush(user));
        return responseUserBean;
    }
}
