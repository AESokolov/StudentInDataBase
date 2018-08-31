package org.itstep;

public class Student {

	private Integer id;
	private String firstName;
	private String secondName;
	private Integer age;
	private String curs;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCurs() {
		return curs;
	}
	public void setCurs(String curs) {
		this.curs = curs;
	}
	
	public Student(int id, String firstName, String secondName, int age, String curs) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.secondName = secondName;
		this.age = age;
		this.curs = curs;
	}
	
	public Student() {
		super();
	}
	
	
	
}