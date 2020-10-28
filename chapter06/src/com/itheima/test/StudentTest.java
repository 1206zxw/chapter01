package com.itheima.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.itheima.po.Customer;
import com.itheima.po.Student;

public class StudentTest {
	
//	@Test
	public static void main(String[] args) throws IOException {
		
			// 1、读取配置文件
			String resource = "mybatis-config.xml";
			InputStream inputStream = 
	                     Resources.getResourceAsStream(resource);
			
			// 2、根据配置文件构建SqlSessionFactory
			SqlSessionFactory sqlSessionFactory = 
	                     new SqlSessionFactoryBuilder().build(inputStream);
			
			// 3、通过SqlSessionFactory创建SqlSession
			SqlSession sqlSession = sqlSessionFactory.openSession();
			// 4、SqlSession执行映射文件中定义的SQL，并返回映射结果
			Student student = sqlSession.selectOne("com.itheima.mapper"
					  + ".StudentMapper.findStudentById", 1);
			
			// 打印输出结果
			System.out.println(student.toString());
			// 5、关闭SqlSession
			sqlSession.close();
		}
	
	@Test
	public void addStudentTest() throws Exception {
		// 1、读取配置文件
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		// 2、根据配置文件构建SqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		// 3、通过SqlSessionFactory创建SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		// 4、SqlSession执行添加操作
		// 4.1创建Customer对象，并向对象中添加数据
		Student student = new Student();
		student.setBalance(66666);
		student.setUsername("王五");
		// 4.2执行SqlSession的插入方法，返回的是SQL语句影响的行数
		int rows = sqlSession.insert("com.itheima.mapper" 
		+ ".StudentMapper.addStudent", student);
		// 4.3通过返回结果判断插入操作是否执行成功
		if (rows > 0) {
			System.out.println("您成功插入了" + rows + "条数据！");
		} else {
			System.out.println("执行插入操作失败！！！");
		}
		// 4.4提交事务
		sqlSession.commit();
		// 5、关闭SqlSession
		sqlSession.close();
	}


		
	
}
