package com.ycx.graduation_project.member.dao;
import com.ycx.graduation_project.member.entity.MemberLevelEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员等级
 * 
 * @author 杨晨曦
 * @email HeJieLin@gulimall.com
 * @date 2023-05-06 19:42:06
 */
@Mapper
public interface MemberLevelDao extends BaseMapper<MemberLevelEntity> {

    MemberLevelEntity getDefaultLevel();
}
