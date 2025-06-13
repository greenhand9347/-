package com.trading.service.Impl;

import com.trading.dao.UserReleaseMapper;
import com.trading.pojo.UserRelease;
import com.trading.service.UserReleaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created  on 2025/5/13.
 */
@Service
public class UserReleaseServiceImpl implements UserReleaseService {
    @Resource
    private UserReleaseMapper userReleaseMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(UserRelease record) {
        return userReleaseMapper.insert(record);
    }

    @Override
    public int insertSelective(UserRelease record) {
        return userReleaseMapper.insertSelective(record);
    }

    @Override
    public UserRelease selectByPrimaryKey(Integer id) {
        return userReleaseMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UserRelease record) {
        return userReleaseMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UserRelease record) {
        return userReleaseMapper.updateByPrimaryKey(record);
    }

    @Override
    public int getCounts(int uid) {
        return userReleaseMapper.getCounts(uid);
    }

    @Override
    public List<UserRelease> selectByUid(int uid, int start) {
        return userReleaseMapper.selectByUid(uid, start);
    }

    @Override
    public List<UserRelease> selectUserProductByUid(int uid) {
        return userReleaseMapper.selectUserProductByUid(uid);
    }
}
