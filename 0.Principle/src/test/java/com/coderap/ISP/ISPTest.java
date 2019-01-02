package com.coderap.ISP;

/**
 * 接口隔离原则
 *
 * 定义：使用多个专门的接口，而不使用单一的总接口，即客户端不应该依赖那些它不需要的接口。
 * 当一个接口设计得过于复杂时，我们应该将其分割为多个约束更为细化的接口，不同接口的实现仅仅需要明确与之相关的方法即可。细化出来的接口应该承担一种相对独立的角色，避免功能上的冗余或缺失。这便是接口隔离原则的体现。
 * 优点：接口隔离原则符合高内聚低耦合的设计思想，可以使类具有更好的可读性、可扩展性和可维护性。
 */

import org.junit.Test;

/**
 * @program: Design-Pattern-Practices
 * @description: 接口隔离原则测试
 * @author: Lennon Chin
 * @create: 2019/01/01 12:30:29
 */
public class ISPTest {

	@Test
	public void test1() {
		Waitress lucy = new Waitress("Lucy");
		Customer tom = new Customer("Tom");
		lucy.receiveCustomer(tom);

		TShirt tShirt = new TShirt(1, "MUJI T-Shirt", 199d);
		lucy.introduceClothesInfo(tom, tShirt);

		// lucy.balance(tShirt);
	}

	@Test
	public void test2() {
		Waitress lucy = new Waitress("Lucy");
		Customer tom = new Customer("Tom");
		lucy.receiveCustomer(tom);

		TShirt tShirt = new TShirt(1, "MUJI T-Shirt", 199d);
		lucy.introduceClothesInfo(tom, tShirt);

		Counter marry = new Counter("Marry");
		marry.balance(tShirt);
	}
}
