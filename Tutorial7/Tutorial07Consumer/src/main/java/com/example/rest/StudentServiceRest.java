package com.example.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentDao;
import com.example.demo.model.StudentModel;
import com.example.demo.service.StudentService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Primary
public class StudentServiceRest implements StudentService{
	@Autowired
	private StudentDao studentDao;

	@Override
	public StudentModel selectStudent(String npm) {
		// TODO Auto-generated method stub
		log.info("REST - select student with npm {}", npm);
		return studentDao.selectStudent(npm);
	}

	@Override
	public List<StudentModel> selectAllStudents() {
		// TODO Auto-generated method stub
		log.info("REST - select all students");
		return null;
	}

	@Override
	public void addStudent(StudentModel student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteStudent(String npm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateStudent(StudentModel student) {
		// TODO Auto-generated method stub
		
	}
	

}
