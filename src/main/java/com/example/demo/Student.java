package com.example.demo;

public class Student {
	private int Rollno;
	private String name;
	public Student()
	{
		
	}
	public Student(int rollno, String name) {
		super();
		Rollno = rollno;
		this.name = name;
	}
	public int getRollno() {
		return Rollno;
	}
	public void setRollno(int rollno) {
		Rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [Rollno=" + Rollno + ", name=" + name + "]";
	}
	public static Object builder() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
