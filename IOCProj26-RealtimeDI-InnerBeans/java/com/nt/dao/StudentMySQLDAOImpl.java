package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.StudentBO;

public final class StudentMySQLDAOImpl implements StudentDAO {

	private static final String STUDENT_REGISTRATION_INSERT_QUERY="INSERT INTO STUDENT_REGISTRATION (SNAME,SADD,DOB,SMARK,TMARK,CGPA) VALUES(?,?,?,?,?,?)";
	private DataSource ds;
	
	public StudentMySQLDAOImpl(DataSource ds) {
		System.out.println("StudentMySQLDAOImpl.StudentMySQLDAOImpl");
		this.ds = ds;
	}

	@Override
	public int insert(StudentBO bo) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		int result=0;
		//get connection object from JDBC connection pool through DataSource
		con=ds.getConnection();
		//create PreparedStatement object by passing SQL query
		ps=con.prepareStatement(STUDENT_REGISTRATION_INSERT_QUERY);
		//set the query parameter values using BO
		ps.setString(1,bo.getSname());
		ps.setString(2,bo.getSadd());
		ps.setDate(3, bo.getDob());
		ps.setFloat(4, bo.getSmark());
		ps.setFloat(5, bo.getTmark());
		ps.setFloat(6, bo.getCgpa());
		//execute the query
		result=ps.executeUpdate();
		//close JDBC connections
		ps.close();
		con.close();
		return result;
	}//insert

}//class
