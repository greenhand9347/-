package com.trading.service;

import com.trading.pojo.Classification;

import java.util.List;

/**
 * Created  on 2025/5/13.
 */
public interface ClassificationService {
    int deleteByPrimaryKey(Integer id);

    int insert(Classification record);

    int insertSelective(Classification record);

    Classification selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Classification record);

    int updateByPrimaryKey(Classification record);

    List<Classification> selectByAid(int aid);
}
