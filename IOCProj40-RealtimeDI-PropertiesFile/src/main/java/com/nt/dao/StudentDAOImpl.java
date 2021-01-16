package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.StudentBO;

public final class StudentDAOImpl implements StudentDAO {

	private static final String STUDENT_INSERT_QUERY_ORACLE="INSERT INTO STUDENT_REGISTRATION (SNO,SNAME,SADD,DOB,SMARK,TMARK,CGPA) VALUES(STUDENT_SEQ.NEXTVAL,?,?,?,?,?,?)";
	private static final String STUDENT_INSERT_QUERY_MYSQL="INSERT INTO STUDENT_REGISTRATION (SNAME,SADD,DOB,SMARK,TMARK,CGPA) VALUES(?,?,?,?,?,?)";
	
	private DataSource ds;
	
	public StudentDAOImpl(DataSource ds) {
		System.out.println("StudentDAOImpl_1-param constructor");
		this.ds=ds;
	}
	
	@Override
	public int insert(StudentBO bo) throws Exception {
		System.out.println("StudentDAOImpl.insert()");
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		//get the connection object
		if(ds!=null)
			con=ds.getConnection();

		//get the prepared statement object
		if(con!=null) {
			//check the configure data base
			if(con.getMetaData().getDatabaseProductName().contains("Oracle")) {
				System.out.println(con.getMetaData().getDatabaseProductName()+" DB is used");
				ps=con.prepareStatement(STUDENT_INSERT_QUERY_ORACLE);
			}
			else {
				System.out.println(con.getMetaData().getDatabaseProductName()+" DB is used");
				ps=con.prepareStatement(STUDENT_INSERT_QUERY_MYSQL);
			}
		}
		//set the query parameters values
		if(bo!=null && ps!=null) {
			ps.setString(1,bo.getSname());
			ps.setString(2,bo.getSadd());
			ps.setDate(3,bo.getDob());
			ps.setFloat(4,bo.getSmark());
			ps.setFloat(5,bo.getTmark());
			ps.setFloat(6,bo.getCgpa());
		}
		//execute the query
		count=ps.executeUpdate();
		//close the database object
		ps.close();
		con.close();
		return count;
	}
}
