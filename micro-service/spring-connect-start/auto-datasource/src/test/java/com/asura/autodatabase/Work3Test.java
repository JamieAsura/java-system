package com.asura.autodatabase;

import com.asura.autodatabase.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Work3Test {
    @Autowired
    private OrderService orderService;

    @Test
    public void test() {
        orderService.writeRead();
        orderService.read1();
        orderService.read2();
        orderService.read3();
    }
}
