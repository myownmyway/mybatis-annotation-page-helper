package com.wpw.mybatisannotationpagehelper.controller;

import com.github.pagehelper.PageHelper;
import com.wpw.mybatisannotationpagehelper.mapper.UserMapper;
import com.wpw.mybatisannotationpagehelper.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wpw
 */
@RestController
public class UserController {
    private final UserMapper userMapper;

    public UserController(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @PostMapping(value = "/list-pagination")
    public List<User> listPagination(@RequestBody User user) {
        PageHelper.startPage(user.getPageNumber(), user.getPageSize());
        return userMapper.listPagination(user);
    }

    @PostMapping(value = "/list")
    public List<User> listPaginationByAnnotation(@RequestBody User user) {
        PageHelper.startPage(user.getPageNumber(), user.getPageSize());
        return userMapper.listPaginationByAnnotation(user);
    }
}
