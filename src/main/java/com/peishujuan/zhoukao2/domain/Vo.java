package com.peishujuan.zhoukao2.domain;

public class Vo {

	private String title;
	private String orderName;
	private String orderMethod;
	public Vo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vo(String title, String orderName, String orderMethod) {
		super();
		this.title = title;
		this.orderName = orderName;
		this.orderMethod = orderMethod;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public String getOrderMethod() {
		return orderMethod;
	}
	public void setOrderMethod(String orderMethod) {
		this.orderMethod = orderMethod;
	}
	@Override
	public String toString() {
		return "Vo [title=" + title + ", orderName=" + orderName + ", orderMethod=" + orderMethod + "]";
	}
	
	
}
