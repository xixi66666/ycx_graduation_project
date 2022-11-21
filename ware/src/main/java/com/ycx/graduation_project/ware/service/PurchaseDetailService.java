package com.ycx.graduation_project.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ycx.common.utils.PageUtils;
import com.ycx.graduation_project.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author Yang Chenxi
 * @email 1253324157@gmail.com
 * @date 2022-11-21 16:36:46
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

