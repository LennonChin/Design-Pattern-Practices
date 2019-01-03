package com.coderap.LOD;

/**
 * @program: Design-Pattern-Practices
 * @description: 服务员类
 * @author: Lennon Chin
 * @create: 2018/11/12 23:59:09
 */
public class Waitress {
	
	private String name;
	
	public Waitress(String name) {
		this.name = name;
	}

	// 委托售后服务人员解决顾客的售后服务
	public void offerAfterSalesService(AfterSalesServer afterSalesServer) {
		afterSalesServer.offerAfterSalesService();
	}
}
