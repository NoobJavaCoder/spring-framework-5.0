package com.baomw.dao;

import org.springframework.stereotype.Repository;

/**
 * 描述:
 * UserDao
 *
 * @author baomw
 * @create 2018-11-10 下午 3:51
 */
@Repository("userDao")
public class UserDao {

	public void query(){
		System.out.println("query");
	}

}
