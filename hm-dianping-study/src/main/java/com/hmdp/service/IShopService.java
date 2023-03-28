package com.hmdp.service;

import com.hmdp.entity.Shop;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xuehongda
 * @since 2021-03-28
 */
public interface IShopService extends IService<Shop> {

    Object queryById(Long id);
}
