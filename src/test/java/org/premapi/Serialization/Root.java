package org.premapi.Serialization;

public class Root {

	
	private String name;
	private String job;
	private DOBData dob;
	
	
	public Root(String name, String job, DOBData dob) {
		super();
		this.name = name;
		this.job = job;
		this.dob = dob;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public DOBData getDob() {
		return dob;
	}
	public void setDob(DOBData dob) {
		this.dob = dob;
	}
	
}
