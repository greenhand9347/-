package com.trading.service;

import com.trading.pojo.Specific;

import java.util.List;

/**
 * Created  on 2025/5/13.
 */
public interface SpecificeService {
    int deleteByPrimaryKey(Integer id);

    int insert(Specific record);

    int insertSelective(Specific record);

    Specific selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Specific record);

    int updateByPrimaryKey(Specific record);

    List<Specific> selectByCid(int cid);
}
