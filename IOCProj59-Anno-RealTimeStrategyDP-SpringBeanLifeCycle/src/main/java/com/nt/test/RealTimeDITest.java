package com.nt.test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.MainController;
import com.nt.vo.StudentVO;

public class RealTimeDITest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		StudentVO vo=null;
		Scanner sc=null;
		String sname=null,sadd=null,dob=null,smark=null,tmark=null,result=null;
		ApplicationContext context=null;
		MainController controller=null;
		//read student details from user
		sc=new Scanner(System.in);
		System.out.println("Enter student's name:");
		sname=sc.nextLine();
		System.out.println("Enter student's address:");
		sadd=sc.nextLine();
		System.out.println("Enter student's dob in given format(yyyy-mm-dd):");
		dob=sc.nextLine();
		System.out.println("Enter secured mark:");
		smark=sc.nextLine();
		System.out.println("Enter total mark");
		tmark=sc.nextLine();
		//create VO class object and set the details
		vo=new StudentVO();
		vo.setSname(sname);
		vo.setSadd(sadd);
		vo.setDob(dob);
		vo.setSmark(smark);
		vo.setTmark(tmark);
		//create factory object
		context=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get controller class object
		controller=context.getBean("controller",MainController.class);
		try {
			//call the business method on controller class object
			result=controller.processStudent(vo);
			System.out.println(result);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			//close IOC container
			((AbstractApplicationContext) context).close();
		}
	}//main
}//class
