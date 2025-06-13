package com.trading.service;

import com.trading.pojo.UserRelease;

import java.util.List;

/**
 * Created  on 2025/5/13.
 */
public interface UserReleaseService {
    int deleteByPrimaryKey(Integer id);

    int insert(UserRelease record);

    int insertSelective(UserRelease record);

    UserRelease selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserRelease record);

    int updateByPrimaryKey(UserRelease record);

    int getCounts(int uid);

    List<UserRelease> selectByUid(int uid, int start);

    List<UserRelease> selectUserProductByUid(int uid);
}
