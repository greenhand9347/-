package com.trading.service;

import com.trading.pojo.AllKinds;

import java.util.List;

/**
 * Created  on 2025/5/13.
 */
public interface AllKindsService {
    int deleteByPrimaryKey(Integer id);

    int insert(AllKinds record);

    int insertSelective(AllKinds record);

    AllKinds selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AllKinds record);

    int updateByPrimaryKey(AllKinds record);

    List<AllKinds> selectAll();
}
