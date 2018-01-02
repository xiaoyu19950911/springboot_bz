package com.springboot.service;

import com.springboot.requestbean.RequestUserBean;
import com.springboot.responsebean.ResponseUserBean;

public interface UserService {

    ResponseUserBean addUser(RequestUserBean request);
}
