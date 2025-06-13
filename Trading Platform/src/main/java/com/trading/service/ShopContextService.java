package com.trading.service;

import com.trading.pojo.ShopContext;

import java.util.List;

/**
 * Created  on 2025/5/13.
 */
public interface ShopContextService {
    int deleteByPrimaryKey(Integer id);

    int insert(ShopContext record);

    int insertSelective(ShopContext record);

    ShopContext selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShopContext record);

    int updateByPrimaryKey(ShopContext record);

    int getCounts(int sid);

    List<ShopContext> findById(int sid, int start);

    List<ShopContext> selectById(int id);
}
