package com.cg.Hibernate.SpringDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	BeanFactory bf = new ClassPathXmlApplicationContext("spring.xml");
    	/*
    	Resource resource = new ClassPathResource("spring.xml");
    	BeanFactory factory = new XmlBeanFactory(resource);
    	*/
    	
    	//ApplicationContext con = new ClassPathXmlApplicationContext("spring.xml");
       // Vehicle obj = (Vehicle) con.getBean("vehicle");
    /*	Vehicle obj = (Vehicle) bf.getBean("bike");
        obj.drive();
        */
    /*	Tyre t = (Tyre) bf.getBean("tyre");
    	System.out.println(t);
    	*/
    	Car car = (Car)bf.getBean("car");
    	car.drive();
    }
}
