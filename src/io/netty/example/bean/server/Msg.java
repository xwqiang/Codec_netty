package io.netty.example.bean.server;

import java.io.Serializable;

public class Msg implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String content;
	public Msg(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Msg [content=" + content + "]";
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}
