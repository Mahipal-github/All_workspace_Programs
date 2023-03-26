package com.cg.Hibernate.SpringAnno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Samsung {

	@Autowired
	//@Qualifier("snapdragon")
	private MobileProcessor processor;
	@Value("Samsung s7")
	private String mobileName;
	

	public void phone()
	{
		
		System.out.println(mobileName+"\n"+"Octa core,4GB RAM,64GB ROM");
		processor.process();
	}

	public MobileProcessor getProcessor() {
		return processor;
	}

	public void setProcessor(MobileProcessor processor) {
		this.processor = processor;
	}
	
}
