package com.shenqingtong.certification.controller;

import javax.annotation.Resource;  
import javax.servlet.http.HttpServletRequest;  
  




import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.RequestMapping;  

import com.shenqingtong.certification.model.Student;
import com.shenqingtong.certification.service.StudentService;
  
@Controller  
@RequestMapping("/student")  
public class StudentController {
	@Resource  
    private StudentService studentService; 
	@RequestMapping("/ConfigTest")  
	public String toIndex(HttpServletRequest request,Model model){  
        int studentId = Integer.parseInt(request.getParameter("id"));  
        Student student = this.studentService.getStudentById(studentId);  
        model.addAttribute("student", student);  
        return "ConfigTest";  
    }  
}
