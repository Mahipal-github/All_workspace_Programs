package com.cg.Streams;

public class StudentClass {

	private int sid;
	private String sname;
	private String phno;
	public StudentClass(int sid, String sname, String phno) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.phno = phno;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	
	
}
