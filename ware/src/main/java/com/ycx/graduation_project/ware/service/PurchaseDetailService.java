package com.ycx.graduation_project.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ycx.common.utils.PageUtils;
import com.ycx.graduation_project.ware.entity.PurchaseDetailEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @author 杨晨曦
 * @email HeJieLin@gulimall.com
 * @date 2023-05-06 19:55:33
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<PurchaseDetailEntity> listDetailByPurchaseId(Long id);
}

