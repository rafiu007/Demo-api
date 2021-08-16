package io.rafiu.springbootapi.api;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Shape {

	@Id
	private String id;
	private String type;
	private String length;
	private String breadth;
	private String result;
	
	public Shape() {
		
	}
	
	public Shape(String id, String type, String length, String breadth) {
		super();
		this.id=id;
		this.type = type;
		this.length = length;
		this.breadth = breadth;
		if(type == "square" || type == "rectangle") {
			this.setResult(Integer.toString(Integer.parseInt(length)*Integer.parseInt(breadth)));
		}
		else {
			this.setResult(Double.toString(3.14*(Double.parseDouble(length)*Double.parseDouble(breadth))));
		}
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getBreadth() {
		return breadth;
	}

	public void setBreadth(String breadth) {
		this.breadth = breadth;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		if(type == "square" || type == "rectangle") {
			this.setResult(Integer.toString(Integer.parseInt(length)*Integer.parseInt(breadth)));
		}
		else {
			this.setResult(Double.toString(3.14*(Double.parseDouble(length)*Double.parseDouble(breadth))));
		}
	}
	
	
}
