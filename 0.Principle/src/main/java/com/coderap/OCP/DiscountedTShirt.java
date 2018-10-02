package com.coderap.OCP;

/**
 * @program: Design-Pattern-Practices
 * @description: 打折的T恤
 * @author: Lennon Chin
 * @create: 2018/10/01 16:13:52
 */
public class DiscountedTShirt extends TShirt {
	
	private Double discount = 1.0;
	
	public DiscountedTShirt(Integer id, String name, Double price) {
		super(id, name, price);
	}
	
	public Double getDiscount() {
		return discount;
	}
	
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	
	public Double getOriginPrice() {
		return super.getPrice();
	}
	
	@Override
	public Double getPrice() {
		return super.getPrice() * this.getDiscount();
	}
}
