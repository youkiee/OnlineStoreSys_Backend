package com.yzh.em.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yzh.em.entity.Icon;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 图标持久层（mapper）
 *
 */
@Mapper
public interface IconMapper extends BaseMapper<Icon> {

    List<Icon> getIconCategoryMapList();
}
