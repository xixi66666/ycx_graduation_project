package com.ycx.graduation_project.product.dao;

import com.ycx.graduation_project.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author Yang Chenxi
 * @email 1253324157@gmail.com
 * @date 2022-11-21 10:53:20
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
