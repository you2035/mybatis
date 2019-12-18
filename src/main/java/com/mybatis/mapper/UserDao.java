package com.mybatis.mapper;

import com.mybatis.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Auther: liuxin
 * @Date: 2019/12/18 14:28
 * @Description:
 */
@Mapper
public interface UserDao {
	int insertUser(User user);

	User getUserById(Integer uid);

	int updateUser(User user);

	int deleteUserById(Integer uid);

	List<User> getAllUser();

}
