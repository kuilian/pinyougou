package com.pinyougou.sellergoods.service;

import com.pinyougou.pojo.TbBrand;

import java.util.List;

/**品牌业务接口
 * @author KuiLian
 * @date 2021/1/2 - 1:00
 */
public interface BrandService {

    /**
     * 查询品牌列表
     * @return
     */
    public List<TbBrand> findAll();

}
