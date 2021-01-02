package com.pinyougou.sellergoods.Impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pinyougou.mapper.TbBrandMapper;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author KuiLian
 * @date 2021/1/2 - 1:02
 */
@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private TbBrandMapper tbBrandMapper;

    @Override
    public List<TbBrand> findAll() {
        /**
         * 表明不带条件查询全部
         */
        return tbBrandMapper.selectByExample(null);
    }
}
