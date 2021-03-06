package com.tcs.dao;

import java.sql.SQLException;
import java.util.List;

import com.tcs.bean.Student;
import com.tcs.exception.StudentNotRegisteredException;
import com.tcs.exception.UserNotFoundException;

public interface StudentDAOInterFace {
	public boolean addStudent(Student student) throws StudentNotRegisteredException;
	public List allStudentsList() throws SQLException;
	public Student getStudentById(int id) throws SQLException;
	public Student deleteStudent(int id) throws SQLException;
	public Student update(int id, Student student) throws SQLException;
	public boolean studentLogin(String studentEmail, String studentPassword) throws UserNotFoundException;
}