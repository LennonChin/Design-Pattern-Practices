package com.coderap.LOD;

/**
 * @program: Design-Pattern-Practices
 * @description: 售后人员类
 * @author: Lennon Chin
 * @create: 2018/01/03 12:19 AM
 */
public class AfterSalesServer {
	
	private String name;
	private Customer customer;
	
	public AfterSalesServer(String name, Customer customer) {
		this.name = name;
		this.customer = customer;
	}

	void offerAfterSalesService() {
        System.out.println("服务员 " + this.name + " 给顾客 " + this.customer.getName() + " 提供售后服务！");
    }
}
