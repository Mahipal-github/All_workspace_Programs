package com.cg.Streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {
		
		List<Employee> emp1 = new ArrayList<Employee>();
		
		emp1.add(new Employee(11, "Naresh", 25000, 985648849));
		emp1.add(new Employee(12, "Arjun", 30000, 876648372));
		emp1.add(new Employee(13, "Raju", 40000, 965648547));
		
		//System.out.println(emp1);
		//All employees with only Names
		emp1.stream().forEach(i->System.out.println(i.getEmployeeName()));
		//Employee details whose sal is greater than 25000
		emp1.stream().filter(emp->emp.getEmployeeSal()>25000).forEach(System.out::println);
		//highest salary
		Optional<Employee> e1 = emp1.stream().collect(Collectors.maxBy(Comparator.comparingLong(Employee::getEmployeeSal)));
		System.out.println(e1.get());
		//minimum salary
		Optional<Employee> e2 = emp1.stream().collect(Collectors.minBy(Comparator.comparingLong(Employee::getEmployeeSal)));
		System.out.println(e2.get());
		//second highest salary
		Optional<Employee> e3 =  emp1.stream().sorted(Comparator.comparingLong(Employee::getEmployeeSal).reversed()).skip(1).findFirst();
		System.out.println(e3.get().getEmployeeName());
			
	}

}
