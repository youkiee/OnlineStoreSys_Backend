package com.yzh.em.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yzh.em.entity.Address;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户地址 持久层（mapper）
 *
 */
@Mapper
public interface AddressMapper extends BaseMapper<Address> {

}
