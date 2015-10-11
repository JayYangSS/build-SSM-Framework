package com.shenqingtong.certification.serviceTest;

import junit.framework.TestCase;

import javax.annotation.Resource;  

import org.apache.log4j.Logger;    
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
import org.springframework.test.context.ContextConfiguration;  
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;  

import com.alibaba.fastjson.JSON; 
import com.shenqingtong.certification.model.Student;
import com.shenqingtong.certification.service.StudentService;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
public class StudentTest extends TestCase {
	private static Logger logger=Logger.getLogger(StudentTest.class);
	@Resource
	private StudentService studentService;
	
	@Test
	public void getStudentById_success(){
		Student student=studentService.getStudentById(1140329046);
		logger.info(JSON.toJSONString(student)); 
	}
}
