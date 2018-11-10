package com.baomw.test;

import com.baomw.dao.UserDao;
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
		annotationConfigApplicationContext.register(UserDao.class);
		annotationConfigApplicationContext.refresh();
		UserDao userDao = (UserDao) annotationConfigApplicationContext.getBean("userDao");
		userDao.query();
	}
}
