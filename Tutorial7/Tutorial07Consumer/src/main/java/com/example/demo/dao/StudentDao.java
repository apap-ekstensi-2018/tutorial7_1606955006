package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.StudentModel;

public interface StudentDao {
	StudentModel selectStudent(String npm);
	List<StudentModel> selectAllStudents();

}
