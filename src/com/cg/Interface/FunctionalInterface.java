package com.cg.Interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalInterface implements FunctionalInterfaceEg{

	@Override
	public void test(List<String> names) {
		for(String str:names)
		{
			if(str.startsWith("Q"))
			System.out.println(str);
		}
		
	}
	public static void main(String[] args) {
		List<String> names = Arrays.asList(
	            "Geek", "GeeksQuiz", "g1", "QA", "Geek2");
		FunctionalInterface obj   = new FunctionalInterface();
		obj.test(names);
		
		    }
	}

