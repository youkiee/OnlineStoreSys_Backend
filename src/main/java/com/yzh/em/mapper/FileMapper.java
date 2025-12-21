package com.yzh.em.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yzh.em.entity.SysFile;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户上传文件 持久层（mapper）
 *
 */
@Mapper
public interface FileMapper extends BaseMapper<SysFile> {
}
