package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainController;
import com.nt.vo.PatientVO;

public class RealTimeDITest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scn=null;
		String pname=null,padd=null,fees=null,dayCount=null,result=null;
		PatientVO vo=null;
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		MainController controller=null;
		//create scanner object
		scn=new Scanner(System.in);
		//read the patient properties from end user using keyboard
		System.out.println("Enter Patient Name:");
		pname=scn.nextLine();
		System.out.println("Enter Patient Address:");
		padd=scn.nextLine();
		System.out.println("Enter Fees Per Day:");
		fees=scn.nextLine();
		System.out.println("Enter How Many Day Patient Stayed in Hospital");
		dayCount=scn.nextLine();
		//create VO class object
		vo=new PatientVO();
		//set patient properties to vo class object
		vo.setPname(pname);vo.setPadd(padd);vo.setFees(fees);vo.setDayCount(dayCount);
		//create IOC spring bean factory object
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		//set appplicationContext path to factory using reader
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get controller class object
		controller=factory.getBean("controller",MainController.class);
		//register patient details
		try {
			result=controller.processPatientRegistration(vo);
			System.out.println(result);
		}
		catch(Exception e) {
			System.out.println("Internal Problem");
			e.printStackTrace();
		}
	}
}
