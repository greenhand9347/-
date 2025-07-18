package com.trading.service;

import com.trading.pojo.GoodsCar;

import java.util.List;

/**
 * Created  on 2025/5/13.
 */
public interface GoodsCarService {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodsCar record);

    int insertSelective(GoodsCar record);

    GoodsCar selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodsCar record);

    int updateByPrimaryKey(GoodsCar record);

    List<GoodsCar> selectByUid(int uid);
}
