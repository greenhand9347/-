package com.trading.service;

import com.trading.pojo.GoodsOfOrderForm;

import java.util.List;

/**
 * Created  on 2025/5/13.
 */
public interface GoodsOfOrderFormService {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodsOfOrderForm record);

    int insertSelective(GoodsOfOrderForm record);

    GoodsOfOrderForm selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodsOfOrderForm record);

    int updateByPrimaryKey(GoodsOfOrderForm record);

    List<GoodsOfOrderForm> selectByOFid(int ofid);
}
