package com.yzh.em.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yzh.em.entity.Carousel;
import com.yzh.em.mapper.CarouselMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 轮播图相关 业务层
 *
 */
@Service
@RequiredArgsConstructor
public class CarouselService extends ServiceImpl<CarouselMapper, Carousel> {

    private final CarouselMapper carouselMapper;

    /**
     * 查询所有轮播图
     *
     * @return 轮播图
     */
    public List<Carousel> findAllCarousel() {
        return carouselMapper.findAllCarousel();
    }
}
