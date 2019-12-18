package com.mybatis.generate;

import org.mybatis.generator.api.ShellRunner;


/**
 * @Auther: liuxin
 * @Date: 2019/12/18 16:59
 * @Description:
 */
public class Generator {
	public static void main(String[] args) throws Exception {
		args = new String[] { "-configfile", "src\\main\\resources\\generator.xml", "-overwrite" };
		ShellRunner.main(args);
	}
}
