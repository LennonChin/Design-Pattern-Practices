package com.coderap.LOD;

import org.junit.Test;

/**
 * @program: Design-Pattern-Practices
 * @description: 迪米特法则测试类
 * @author: Lennon Chin
 * @create: 2019/01/03 12:28 AM
 */
public class LODTest {

    @Test
    public void test1() {
        Waitress waitress = new Waitress("Marry");
        waitress.offerAfterSalesService(new AfterSalesServer("Lucy", new Customer("Jack")));
    }
}
