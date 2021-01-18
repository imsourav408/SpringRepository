package com.nt.listeners;

import java.util.Date;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class IOCContainerMonitoringListener implements ApplicationListener {

	private long start,end;
	
	public IOCContainerMonitoringListener() {
		System.out.println("IOCContainerMonitoringListener_0-paramConstructor");
	}
	
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		if(event.toString().indexOf("ContextRefreshed")!=-1) {
			start=System.currentTimeMillis();
			System.out.println("IOC container started at: "+new Date());
		}
		else if (event.toString().indexOf("ContextClosed")!=-1) {
			end=System.currentTimeMillis();
			System.out.println("IOC container stopped at: "+new Date());
			System.out.println("IOC container active duration ::"+(end-start)/1000+"sec");
		}
	}
}
