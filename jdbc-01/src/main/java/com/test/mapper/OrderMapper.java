package com.test.mapper;

import com.test.entity.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface OrderMapper {

    /**
     * 新增订单
     * @param order
     * @return
     */
    @Insert("insert into t_order (price, user_id, status) values (#{price}, #{user_id}, #{status})")
    int insert(Order order);

    /**
     * 根据订单ID查询
     * @param orderIds
     * @return
     */
    @Select("<script>" +
            "   select " +
            "   * " +
            "   from " +
            "   t_order" +
            "   where order_id in " +
            "   <foreach collection='orderIds' open='('  separator=',' close=')' item='id' >" +
            "   #{id}" +
            "   </foreach>" +
            "</script>")
    List<Order> getByOrderIds(@Param("orderIds") List<Long> orderIds);

    /**
     * 获取所有的订单
     * @return
     */
    @Select("select * from t_order")
    List<Order> getAll();
}
