package com.cg.Hibernate.SpringAnno;

import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements MobileProcessor{

	public void process() {
		
		System.out.println("Worlds no 1 processor");
		
	}

}
