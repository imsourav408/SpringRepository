package com.nt.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.nt.comp.Courier;
import com.nt.comp.Flipkart;

public class FlipkartFactory {
	private static Properties props=null;
	static {
		InputStream is=null;
		try {
			//locate property file using streams
			is=new FileInputStream("src/com/nt/commons/info.properties");
			props=new Properties();
			//load properties file data into properties collection
			props.load(is);
		}
		catch(FileNotFoundException fnf) {
			fnf.printStackTrace();
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}//static
	//factory method
	public static Flipkart getInstance() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Courier courier=null;
		Flipkart fpkt=null;
		//create dependent class object
		courier=(Courier)Class.forName(props.getProperty("sdp.dependent")).newInstance();
		//create target class object
		fpkt=new Flipkart();
		//set dependent class into target class
		fpkt.setCourier(courier);
		//return target class object
		return fpkt;
	}//get Instance
}//class
