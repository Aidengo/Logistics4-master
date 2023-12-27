package com.logistics4.ssm.mapper;

import com.logistics4.ssm.pojo.Item;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ItemMapper {

    @Delete("update item set number = number-1 where itemname=#{itemname}")
    int updateByItemName(@Param("itemname") String itemname);

    @Insert("insert into item values (#{itemname},#{number},#{ref},#{warehousename},#{commonCarrier},)")
    int addItem(@Param("itemname") String itemname,@Param("number") int number,@Param("ref") int ref,
                @Param("warehousename") String warehousename,@Param("commonCarrier")String commonCarrier);

    @Select("select * from item")
    List<Item> selectAllItem();
}
