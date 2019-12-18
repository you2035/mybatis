package com.mybatis.model;

/**
 * @Auther: liuxin
 * @Date: 2019/12/18 14:27
 * @Description:
 */
public class User {
	private Integer uId;
	private String uName;

	public Integer getuId() {
		return uId;
	}

	public void setuId(Integer uId) {
		this.uId = uId;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}
}
