package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainController;
import com.nt.vo.StudentVO;

public class RealtimeDITest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String sname=null,sadd=null,dob=null,smark=null,tmark=null,result=null;
		StudentVO vo=null;
		MainController controller=null;
		Scanner sc=null;
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		//read the inputs from user
		sc=new Scanner(System.in);
		System.out.println("Enter student's name:");
		sname=sc.nextLine();
		System.out.println("Enter student's address:");
		sadd=sc.nextLine();
		System.out.println("Enter student's dob in given format(yyyy-mm-dd):");
		dob=sc.nextLine();
		System.out.println("Enter secured marks:");
		smark=sc.nextLine();
		System.out.println("Enter total marks:");
		tmark=sc.nextLine();
		//set values to VO
		vo=new StudentVO();
		vo.setSname(sname);
		vo.setSadd(sadd);
		vo.setDob(dob);
		vo.setSmark(smark);
		vo.setTmark(tmark);
		//create spring factory object
		factory=new DefaultListableBeanFactory();
		//create reader object
		reader=new XmlBeanDefinitionReader(factory);
		//locate and load spring bean configuration file
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get controller class object
		controller=factory.getBean("controller",MainController.class);
		try {
			//use controller
			result=controller.processStudent(vo);
			System.out.println(result);
		}
		catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}
	}//main

}//class
