package com.trading.service.Impl;

import com.trading.dao.BoughtShopMapper;
import com.trading.pojo.BoughtShop;
import com.trading.service.BoughtShopService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created  on 2025/5/13.
 */
@Service
public class BoughtShopServiceImpl implements BoughtShopService {
    @Resource
    private BoughtShopMapper boughtShopMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(BoughtShop record) {
        return boughtShopMapper.insert(record);
    }

    @Override
    public int insertSelective(BoughtShop record) {
        return boughtShopMapper.insertSelective(record);
    }

    @Override
    public BoughtShop selectByPrimaryKey(Integer id) {
        return boughtShopMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(BoughtShop record) {
        return boughtShopMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(BoughtShop record) {
        return boughtShopMapper.updateByPrimaryKey(record);
    }

    @Override
    public int getCounts(int uid) {
        return boughtShopMapper.getCounts(uid);
    }

    @Override
    public List<BoughtShop> selectByUid(int uid, int start) {
        return boughtShopMapper.selectByUid(uid, start);
    }
}
