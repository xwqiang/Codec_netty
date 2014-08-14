package io.netty.example.bean;

import java.io.Serializable;

public class UserInfo implements Serializable{
	/**
	 * 
	 */
	public UserInfo(String name){
		this.name1 = name;
	}
	private static final long serialVersionUID = 1L;
	public String name1;
	@Override
	public String toString() {
		return "UserInfo [name=" + name1 + "]";
	}
	public String getName() {
		return name1;
	}
	public void setName(String name) {
		this.name1 = name;
	}
	
}
