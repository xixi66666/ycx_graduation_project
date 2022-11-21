package com.ycx.graduation_project.order.dao;

import com.ycx.graduation_project.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author Yang Chenxi
 * @email 1253324157@gmail.com
 * @date 2022-11-21 16:16:29
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
