package com.nt.test;

import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.MainController;
import com.nt.vo.EmployeeVO;

public class NestedContainerTestApplicationContext {

	public static void main(String[] args) {
		ApplicationContext parentCtx=null,childCtx=null;
		List<EmployeeVO> listVO=null;
		MainController controller=null;
		//create parent IOC container
		parentCtx=new ClassPathXmlApplicationContext("com/nt/cfgs/business-beans.xml");
		//create child IOC container
		childCtx=new ClassPathXmlApplicationContext(new String[]{"com/nt/cfgs/presentation-beans.xml"},parentCtx);
		//get controller class object
		controller=childCtx.getBean(MainController.class,"controller");
		System.out.println("-----------------------------------------------------------------");
		//invoke business method
		try {
			listVO=controller.gatherEmpsByDesgs("clerk", "manager","president");
			//display results
			for(EmployeeVO vo:listVO) {
				System.out.println(vo);
			}
		}
		catch (SQLException se) {
			se.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			//close containers
			((AbstractApplicationContext) parentCtx).close();
			((AbstractApplicationContext) childCtx).close();
		}
	}
}
