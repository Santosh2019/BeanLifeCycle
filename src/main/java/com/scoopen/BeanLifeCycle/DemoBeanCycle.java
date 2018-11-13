package com.scoopen.BeanLifeCycle;

public class DemoBeanCycle {

	private int id;
	   
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void initDemo() {
	
		System.out.println("Init Method Execute");
	}
	public void executeFirst() {
		System.out.println("Normal Method");
		
	}
	public void destroyDemo() {
		System.out.println("Destroy Method");
	}
	@Override
	public String toString() {
		return "DemoBeanCycle [id=" + id + "]";
	}
	
	
}
