package com.atguigu.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * εεεΊε­
 *
 * @author muyuanwu
 * @email muyuanwu@gmail.com
 * @date 2021-04-29 19:52:48
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

