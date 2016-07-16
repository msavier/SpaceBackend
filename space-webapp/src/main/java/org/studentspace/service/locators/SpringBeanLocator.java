package org.studentspace.service.locators;

import java.util.Map;

import  org.hibernate.SessionFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanLocator implements ApplicationContextAware {

private static ApplicationContext appContext;
	

	public void setApplicationContext(ApplicationContext context) throws BeansException {
		appContext = context;
	}  
   
   public static Object getBean(String name) {   
      if (null == appContext) {   
    	  appContext = new ClassPathXmlApplicationContext("applicationContext-hibernate.xml");
      }
   
      return appContext.getBean(name);   
   }

   public static void main(String[] args){
	   SessionFactory tmp = (SessionFactory)getBean("sessionFactory");
	   
	   if(tmp != null){ System.out.println("SUCCESS");}
   }
	
}
