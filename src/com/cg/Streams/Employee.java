package com.cg.Streams;

public class Employee {

	private int employeeId;
	private String employeeName;
	private long employeeSal;
	private long phoneNo;
	
	
	public Employee(int employeeId, String employeeName, long employeeSal, long phoneNo) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSal = employeeSal;
		this.phoneNo = phoneNo;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public long getEmployeeSal() {
		return employeeSal;
	}
	public void setEmployeeSal(long employeeSal) {
		this.employeeSal = employeeSal;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSal=" + employeeSal
				+ ", phoneNo=" + phoneNo + "]";
	}
	
	
}
