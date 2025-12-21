package com.yzh.em.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yzh.em.entity.OrderGoods;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单-商品关联持久层 （mapper）
 *
 */
@Mapper
public interface OrderGoodsMapper extends BaseMapper<OrderGoods> {

}
