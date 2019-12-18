package com.mybatis.mapper;

import com.mybatis.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

/**
 * @Auther: liuxin
 * @Date: 2019/12/18 14:28
 * @Description:
 */
@Mapper
public interface UserMapper {
	int insertUser(User user);

	User getUserById(Integer uid);

	int updateUser(User user);

	int deleteUserById(Integer uid);

	List<User> getAllUser();

	@Select("select * from t_user where ${col} = #{value}")
	User findByCol(@Param("col")String col, @Param("value") String value);

}
