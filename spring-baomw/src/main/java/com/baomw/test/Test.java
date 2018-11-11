package com.baomw.test;

import com.baomw.dao.UserDao;
import com.baomw.dao.UserDaoFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 描述:
 * Test
 *
 * @author baomw
 * @create 2018-11-10 下午 3:53
 */
public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext
													= new AnnotationConfigApplicationContext();
		annotationConfigApplicationContext.register(UserDaoFactory.class);
		annotationConfigApplicationContext.refresh();
		UserDao userDao = (UserDao) annotationConfigApplicationContext.getBean("bean");
		userDao.query();
	}
}
