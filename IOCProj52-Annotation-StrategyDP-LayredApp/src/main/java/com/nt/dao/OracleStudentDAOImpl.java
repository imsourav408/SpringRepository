package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.nt.bo.StudentBO;

@Repository("oraStudentDAO")
public final class OracleStudentDAOImpl implements StudentDAO {

	private static final String STUDENT_REGISTRATION_INSERT_QUERY="INSERT INTO STUDENT_REGISTRATION (SNO,SNAME,SADD,DOB,SMARK,TMARK,CGPA) VALUES(STUDENT_SEQ.NEXTVAL,?,?,?,?,?,?)";
	
	@Autowired
	@Qualifier(value = "oraHkDs")
	private DataSource ds;

	@Override
	public int insert(StudentBO bo) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		//get connection object from JDBC connection pull
		con=ds.getConnection();
		//create prepared statement object by passing the SQL query
		ps=con.prepareStatement(STUDENT_REGISTRATION_INSERT_QUERY);
		//set the values to QUERY parameters
		ps.setString(1,bo.getSname());
		ps.setString(2,bo.getSadd());
		ps.setDate(3,bo.getDob());
		ps.setFloat(4,bo.getSmark());
		ps.setFloat(5,bo.getTmark());
		ps.setFloat(6,bo.getCgpa());
		//execute the query
		count=ps.executeUpdate();
		//close JDBC connection objects
		ps.close();
		con.close();
		return count;
	}//insert
}
