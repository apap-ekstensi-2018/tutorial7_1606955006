package com.example.demo.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.StudentModel;

import groovy.lang.Lazy;

@Service
public class StudentDaoImpl implements StudentDao{
	
	@Autowired
	@Lazy
	private RestTemplate restTemplate;

	@Override
	public StudentModel selectStudent(String npm) {
		// TODO Auto-generated method stub
		StudentModel student = restTemplate.getForObject("http://localhost:8080/rest/student/view/"+npm, StudentModel.class);
		
		return student;
	}

	@Override
	public List<StudentModel> selectAllStudents() {
		// TODO Auto-generated method stub
		StudentModel[] student = restTemplate.getForObject("http://localhost:8080/rest/student/viewall", StudentModel[].class);
		return Arrays.asList(student);
	}

}
