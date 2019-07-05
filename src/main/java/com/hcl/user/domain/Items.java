package com.hcl.user.domain;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Items {

	private String itemName;
	private double quantity;
	private double price;
	 @ManyToOne
	    @JoinColumn(name="cart_id", nullable=false)
	    private UserCart cart;
	 
	    public UserCart getCart() {
		return cart;
	}

	public void setCart(UserCart cart) {
		this.cart = cart;
	}

		public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

		public Items() {}
	     
	   
}
