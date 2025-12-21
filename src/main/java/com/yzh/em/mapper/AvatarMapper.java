package com.yzh.em.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yzh.em.entity.Avatar;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户头像 持久层（mapper）
 *
 */
@Mapper
public interface AvatarMapper extends BaseMapper<Avatar> {

}
