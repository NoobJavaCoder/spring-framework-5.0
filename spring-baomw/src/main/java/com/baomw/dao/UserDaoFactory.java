package com.baomw.dao;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * 描述:
 * 工厂类
 *
 * @author baomw
 * @create 2018-11-11 下午 12:50
 */
@Component("bean")
public class UserDaoFactory implements FactoryBean {

	Object obj;

	@Override
	public Object getObject() throws Exception {
		return new UserDao();
	}

	@Override
	public Class<?> getObjectType() {
		return null;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}



	public void query(){
		System.out.println("factory");
	}
}
