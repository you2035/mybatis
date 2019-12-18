package com.mybatis.controller;

import com.mybatis.mapper.UserMapper;
import com.mybatis.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: liuxin
 * @Date: 2019/12/18 14:31
 * @Description:
 */
@Controller
@RequestMapping("user")
public class UserController {
	@Resource
	private UserMapper userDao;

	@RequestMapping(value = "getUser")
	@ResponseBody
	public User getUser(){
		User user = userDao.getUserById(1);
		return user;
	}

	@RequestMapping(value = "getAllUser")
	@ResponseBody
	public List<User> getAllUser(){
		List<User> userList = userDao.getAllUser();
		return userList;
	}

	@RequestMapping("findByCol")
	@ResponseBody
	public User findByCol(){
		User user = userDao.findByCol("id","2");
		return  user;
	}
}
