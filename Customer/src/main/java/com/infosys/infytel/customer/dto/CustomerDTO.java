package com.infosys.infytel.customer.dto;

import java.util.List;

import com.infosys.infytel.customer.entity.Customer;

public class CustomerDTO {
	long phoneNo;
	String name;
	int age;
	char gender;
	List<Long> friendAndFamily;
	String password;
	String address;
	PlanDTO currentPlan;

	public PlanDTO getCurrentPlan() {
		return currentPlan;
	}

	public void setCurrentPlan(PlanDTO currentPlan) {
		this.currentPlan = currentPlan;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Long> getFriendAndFamily() {
		return friendAndFamily;
	}

	public void setFriendAndFamily(List<Long> friendAndFamily) {
		this.friendAndFamily = friendAndFamily;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public static CustomerDTO valueOf(Customer cust) {
		CustomerDTO custDTO = new CustomerDTO();
		custDTO.setAge(cust.getAge());
		custDTO.setGender(cust.getGender());
		custDTO.setName(cust.getName());
		custDTO.setPhoneNo(cust.getPhoneNo());
		custDTO.setAddress(cust.getAddress());
		PlanDTO planDTO = new PlanDTO();
		planDTO.setPlanId(cust.getPlanId());
		custDTO.setCurrentPlan(planDTO);
		custDTO.setCurrentPlan(planDTO);
		return custDTO;
	}

	public Customer createEntity() {
		Customer cust = new Customer();
		cust.setAge(this.getAge());
		cust.setGender(this.getGender());
		cust.setName(this.getName());
		cust.setPhoneNo(this.getPhoneNo());
		cust.setAddress(this.getAddress());
		cust.setPassword(this.getPassword());
		return cust;
	}
}