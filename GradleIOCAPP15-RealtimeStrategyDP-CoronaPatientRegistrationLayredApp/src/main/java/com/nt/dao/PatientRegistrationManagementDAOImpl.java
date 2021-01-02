package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.PatientBO;

public class PatientRegistrationManagementDAOImpl implements PatientRegistrationManagementDAO {

	private static final String PATIENT_REGISTRATION_INSERT_QUERY="INSERT INTO CORONA_PATIENT_REGISTRATION(PNAME,PADD,FEES,DAYCOUNT,TOTALAMT)VALUES(?,?,?,?,?)";
	DataSource ds=null;
	
	public PatientRegistrationManagementDAOImpl(DataSource ds) {
		this.ds=ds;
	}
	
	@Override
	public int insert(PatientBO bo) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		int result=0;
		//create connection object using JDBC connection pool
		con=ds.getConnection();
		//create prepare statement object
		ps=con.prepareStatement(PATIENT_REGISTRATION_INSERT_QUERY);
		//set data to query params
		ps.setString(1,bo.getPname());
		ps.setString(2,bo.getPadd());
		ps.setFloat(3,bo.getFees());
		ps.setInt(4,bo.getDayCount());
		ps.setFloat(5,bo.getTotalAmt());
		//execute the query
		result=ps.executeUpdate();
		//close JDBC objects
		ps.close();
		con.close();
		return result;
	}
}
