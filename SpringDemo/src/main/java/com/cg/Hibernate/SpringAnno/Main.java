package com.cg.Hibernate.SpringAnno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
public static void main(String[] args) {
	
	ApplicationContext con = new AnnotationConfigApplicationContext(AppConfig.class);
	
	Samsung s = con.getBean(Samsung.class);
   s.phone();
	
}
	
}
