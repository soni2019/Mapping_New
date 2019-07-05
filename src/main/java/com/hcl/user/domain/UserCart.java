package com.hcl.user.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="CART")
public class UserCart {
	
private double cartId;
	@OneToMany(mappedBy="cart")
    private Set<Items> items;

	
	public double getCartId() {
		return cartId;
	}

	public void setCartId(double cartId) {
		this.cartId = cartId;
	}

	public Set<Items> getItems() {
		return items;
	}

	public void setItems(Set<Items> items) {
		this.items = items;
	}
}
