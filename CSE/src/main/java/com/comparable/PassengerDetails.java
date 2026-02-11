package com.comparable;

// comparable interface is used when we make use of pojo class otherwise we make use of comparator interface
public class PassengerDetails implements Comparable {
	
	int id;
	String name;
	String from;
	String destination;
	String medium;
	public PassengerDetails(int id, String name, String from, String destination, String medium) {
		super();
		this.id = id;
		this.name = name;
		this.from = from;
		this.destination = destination;
		this.medium = medium;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setFrom(String from) {
		this.from = from;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}


	public void setMedium(String medium) {
		this.medium = medium;
	}


	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getFrom() {
		return from;
	}
	public String getDestination() {
		return destination;
	}
	public String getMedium() {
		return medium;
	}
	@Override
	public String toString() {
		return "PassengerDetails [id=" + id + ", name=" + name + ", from=" + from + ", destination=" + destination
				+ ", medium=" + medium + "]";
	}


	@Override
	
	//compareTo help to sort the complex object based on some feature here we sort based on id.
	public int compareTo(Object o) {
		if(this.id > ((PassengerDetails)(o)).id) {
			return 1;
		}
		else {
			return -1;
		}
	}
	

}
