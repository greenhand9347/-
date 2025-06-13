package com.trading.service;

import com.trading.pojo.UserWant;

import java.util.List;

/**
 * Created  on 2025/5/13.
 */
public interface UserWantService {
    int deleteByPrimaryKey(Integer id);

    int insert(UserWant record);

    int insertSelective(UserWant record);

    UserWant selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserWant record);

    int updateByPrimaryKey(UserWant record);

    int getCounts(int uid);

    List<UserWant> selectByUid(int uid, int start);

    List<UserWant> selectMineByUid(int id);

    List<UserWant> selectAll();
}
