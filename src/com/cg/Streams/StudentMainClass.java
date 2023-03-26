package com.cg.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentMainClass {

	public static void main(String[] args) {

	List<StudentClass> ls = new ArrayList<StudentClass>();
	ls.add(new StudentClass(11,"John","9844744848"));
	ls.add(new StudentClass(13,"Alex","8497348374"));
	ls.add(new StudentClass(14,"Cary","8947948494"));
	ls.add(new StudentClass(12,"Sam","98439393942"));
	ls.add(new StudentClass(15,"Elen","4984748499"));
	
	StudentClass st = ls.stream().max((s1,s2)->s1.getSid()-s2.getSid()).get();
	
	System.out.println(st);
/*	for(StudentClass sc : ls)
	{
		System.out.println(sc.getSid()+" "+sc.getSname()+" "+sc.getPhno());
	}
		
	}
	*/
}
}
