package com.shenqingtong.certification.service.Impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shenqingtong.certification.dao.StudentMapper;
import com.shenqingtong.certification.model.Student;
import com.shenqingtong.certification.service.StudentService;


@Service("StudenService")
public class StudentServiceImpl implements StudentService {

	@Resource
	private StudentMapper studentMapper;
	@Override
	public Student getStudentById(Integer studentId) {
		return this.studentMapper.selectByPrimaryKey(studentId);
	}

}
