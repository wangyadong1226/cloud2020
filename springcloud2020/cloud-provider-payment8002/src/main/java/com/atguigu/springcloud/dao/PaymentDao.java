package com.atguigu.springcloud.dao;


import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.*;
//import tk.mybatis.mapper.common.Mapper;

@Mapper
public interface PaymentDao {

    @Select("select * from payment where id = #{id}")
    Payment selectById(@Param("id") Integer id);

    @Insert("insert into payment(serial) values(#{serial})")
    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn = "id")
    int insert(Payment payment);
}
