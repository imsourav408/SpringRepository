package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.nt.bo.EmployeeBO;

public final class EmployeeDAOImpl implements EmployeeDAO {

	private static final String GET_EMPS_QUERY="SELECT EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO FROM EMP WHERE JOB IN (?,?,?) ORDER BY JOB";
	private DataSource ds;
	
	public EmployeeDAOImpl(DataSource ds) {
		System.out.println("EmployeeDAOImpl.1-param constructor");
		this.ds=ds;
	}
	
	@Override
	public List<EmployeeBO> getEmployees(String desg1, String desg2, String desg3) throws Exception {
		System.out.println("EmployeeDAOImpl.getEmployees()");
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<EmployeeBO> employeeList=null;
		EmployeeBO bo=null;
		try {
			//get pooled JDBC connection
			con=ds.getConnection();
			//get prepared statement object
			ps=con.prepareStatement(GET_EMPS_QUERY);
			//set values to query parameters
			ps.setString(1,desg1);ps.setString(2,desg2);ps.setString(3,desg3);
			//execute the query
			rs=ps.executeQuery();
			//convert result set record into employeeList
			employeeList=new ArrayList<EmployeeBO>();
			while(rs.next()) {
				bo=new EmployeeBO();
				//copy each record of ResultSet obj to BO class object
				bo.setEmpno(rs.getInt(1));
				bo.setEname(rs.getString(2));
				bo.setJob(rs.getString(3));
				bo.setMgr(rs.getInt(4));
				bo.setHiredate(rs.getDate(5));
				bo.setSal(rs.getFloat(6));
				bo.setComm(rs.getFloat(7));
				bo.setDeptno(rs.getInt(8));
				//add each object of bo class to list connection
				employeeList.add(bo);
			}
		}
		catch (SQLException se) {
			se.printStackTrace();
			throw se;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		finally {
			//close JDBC objects
			try {
				if(rs!=null)
					rs.close();
			}
			catch (SQLException se) {
				se.printStackTrace();
				throw se;
			}
			try {
				if(ps!=null)
					ps.close();
			}
			catch (SQLException se) {
				se.printStackTrace();
				throw se;
			}
			try {
				if(con!=null)
					con.close();
			}
			catch (SQLException se) {
				se.printStackTrace();
				throw se;
			}
		}
		return employeeList;
	}
}
