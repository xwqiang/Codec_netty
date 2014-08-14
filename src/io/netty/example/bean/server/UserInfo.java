package io.netty.example.bean.server;

import java.io.Serializable;

public class UserInfo implements Serializable{
	/**
	 * 
	 */
	public UserInfo(String name){
		this.name = name;
	}
	private static final long serialVersionUID = 21L;
	public String name;
	@Override
	public String toString() {
		return "UserInfo [name=" + name + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
