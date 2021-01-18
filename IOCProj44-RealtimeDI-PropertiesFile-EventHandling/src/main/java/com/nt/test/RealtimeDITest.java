package com.nt.test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.MainController;
import com.nt.vo.StudentVO;

public class RealtimeDITest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		MainController controller=null;
		Scanner scn=null;
		String sname=null,sadd=null,dob=null,smark=null,tmark=null,result=null;
		ApplicationContext context=null;
		StudentVO vo=null;
		//get the inputs from end user
		scn=new Scanner(System.in);
		System.out.println("Enter the student's name:");
		sname=scn.nextLine();
		System.out.println("Enter the student's address:");
		sadd=scn.nextLine();
		System.out.println("Enter the student's date of birth(yyyy-mm-dd):");
		dob=scn.nextLine();
		System.out.println("Enter the student's secured total mark:");
		smark=scn.nextLine();
		System.out.println("Enter the student's full mark:");
		tmark=scn.nextLine();
		//create vo object and provide all the details
		vo=new StudentVO();
		vo.setSname(sname);
		vo.setSadd(sadd);
		vo.setDob(dob);
		vo.setSmark(smark);
		vo.setTmark(tmark);
		//create IOC container
		context=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		System.out.println("Container class object created");
		//get the controller object
		controller=context.getBean(MainController.class,"controller");
		//register student
		try {
			result=controller.processStudent(vo);
			System.out.println(result);
		}
		catch (Exception e) {
			System.out.println("Some internal problems occured");
			e.printStackTrace();
		}
		//close the container
		((AbstractApplicationContext)context).close();
	}
}