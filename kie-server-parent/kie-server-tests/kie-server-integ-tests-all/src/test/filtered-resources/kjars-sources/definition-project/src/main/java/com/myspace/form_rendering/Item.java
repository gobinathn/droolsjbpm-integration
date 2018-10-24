package com.myspace.form_rendering;

/**
 * This class was automatically generated by the data modeler tool.
 */
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "item-object")
@XmlAccessorType(XmlAccessType.FIELD)
public class Item implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String name;
	private java.lang.Integer quantity;
	private java.lang.Double price;

	public Item() {
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(java.lang.Integer quantity) {
		this.quantity = quantity;
	}

	public java.lang.Double getPrice() {
		return this.price;
	}

	public void setPrice(java.lang.Double price) {
		this.price = price;
	}

	public Item(java.lang.String name, java.lang.Integer quantity,
			java.lang.Double price) {
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

}