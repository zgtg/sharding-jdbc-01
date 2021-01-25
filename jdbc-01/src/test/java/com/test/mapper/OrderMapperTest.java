package com.test.mapper;

import com.test.Jdbc01Test;
import com.test.entity.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Jdbc01Test.class)
public class OrderMapperTest {
    @Autowired
    OrderMapper orderMapper;

    /**
     * 新增订单
     */
    @Test
    public void testInsert() {
        for(int i=2; i<=20; i++) {
            orderMapper.insert(new Order(new Random().nextInt(20), i, 1));
        }

    }

    /**
     * 根据订单ID查询
     */
    @Test
    public void testGetByOrderIds() {
        List<Long> orderIds = new ArrayList<>();
        orderIds.add(560609121712209920L);
//        orderIds.add(558074997680111616l);
//        orderIds.add(558074639364915201l);
        System.out.println(orderMapper.getByOrderIds(orderIds));
    }

    /**
     * 获取所有的订单
     */
    @Test
    public void testGetAll() {
        System.out.println(orderMapper.getAll().size());
    }
}
