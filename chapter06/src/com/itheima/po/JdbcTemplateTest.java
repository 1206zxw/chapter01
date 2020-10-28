package com.itheima.po;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTemplateTest {
	/**
	 * 使用execute()方法建表
	 */
	/*
	 * public static void main(String[] args) { // 加载配置文件 ApplicationContext
	 * applicationContext = new
	 * ClassPathXmlApplicationContext("applicationContext.xml"); //
	 * 获取JdbcTemplate实例 JdbcTemplate jdTemplate = (JdbcTemplate)
	 * applicationContext.getBean("jdbcTemplate"); //
	 * 使用execute()方法执行SQL语句，创建用户账户管理表Student jdTemplate.execute(
	 * "create table Student(" + "id int primary key auto_increment," +
	 * "username varchar(50)," + "balance double)");
	 * System.out.println("账户表Student创建成功！"); }
	 */

	@Test
	public void mainTest() {
		// 加载配置文件
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 获取JdbcTemplate实例
		JdbcTemplate jdTemplate = (JdbcTemplate) applicationContext.getBean("jdbcTemplate");
		// 使用execute()方法执行SQL语句，创建用户账户管理表Student
		jdTemplate.execute("create table Student(" + "id int primary key auto_increment," + "username varchar(50),"
				+ "balance double)");
		System.out.println("账户表Student创建成功！");
	}
//
//	@Test
//	public void addStudentTest() {
//		// 加载配置文件
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//		// 获取StudentDao实例
//		StudentDao StudentDao = (StudentDao) applicationContext.getBean("StudentDao");
//		// 创建Student对象，并向Student对象中添加数据
//		Student Student = new Student();
//		Student.setUsername("tom");
//		Student.setBalance(1000.00);
//		// 执行addStudent()方法，并获取返回结果
//		int num = StudentDao.addStudent(Student);
//		if (num > 0) {
//			System.out.println("成功插入了" + num + "条数据！");
//		} else {
//			System.out.println("插入操作执行失败！");
//		}
//	}
//	
//	@Test
//	public void updateStudentTest() {
//	    // 加载配置文件
//	    ApplicationContext applicationContext = 
//	            new ClassPathXmlApplicationContext("applicationContext.xml");
//	    // 获取StudentDao实例
//	    StudentDao StudentDao = 
//	            (StudentDao) applicationContext.getBean("StudentDao");
//	    // 创建Student对象，并向Student对象中添加数据
//	    Student Student = new Student();
//	    Student.setId(1);
//	    Student.setUsername("tom");
//	    Student.setBalance(2000.00);
//	    // 执行updateStudent()方法，并获取返回结果
//	    int num = StudentDao.updateStudent(Student);
//	    if (num > 0) {
//	        System.out.println("成功修改了" + num + "条数据！");
//	    } else {
//	        System.out.println("修改操作执行失败！");
//	    }
//	}
//
//	@Test
//	public void deleteStudentTest() {
//	    // 加载配置文件
//	    ApplicationContext applicationContext = 
//	            new ClassPathXmlApplicationContext("applicationContext.xml");
//	    // 获取StudentDao实例
//	    StudentDao StudentDao = 
//	            (StudentDao) applicationContext.getBean("StudentDao");
//	    // 执行deleteStudent()方法，并获取返回结果
//	    int num = StudentDao.deleteStudent(1);
//	    if (num > 0) {
//	        System.out.println("成功删除了" + num + "条数据！");
//	    } else {
//	        System.out.println("删除操作执行失败！");
//	    }
//	}
//	
//	@Test
//	public void findStudentByIdTest() {
//	    // 加载配置文件
//	    ApplicationContext applicationContext = 
//	            new ClassPathXmlApplicationContext("applicationContext.xml");
//	    // 获取StudentDao实例
//	    StudentDao StudentDao = 
//	            (StudentDao) applicationContext.getBean("StudentDao");
//	    // 执行findStudentById()方法
//	    Student Student = StudentDao.findStudentById(1);
//	    System.out.println(Student);
//	}
//	
//	@Test
//	public void findAllStudentTest() {
//	    // 加载配置文件
//	    ApplicationContext applicationContext = 
//	            new ClassPathXmlApplicationContext("applicationContext.xml");
//	    // 获取StudentDao实例
//	    StudentDao StudentDao = 
//	            (StudentDao) applicationContext.getBean("StudentDao");
//	    // 执行findAllStudent()方法,获取Student对象的集合
//	    List<Student> Student = StudentDao.findAllStudent();
//	    // 循环输出集合中的对象
//	    for (Student act : Student) {
//	        System.out.println(act);
//	    }
//	}
//


}
