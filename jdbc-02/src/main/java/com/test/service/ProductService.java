package com.test.service;

import com.test.entity.ProductDescript;
import com.test.entity.ProductInfo;
import com.test.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    ProductMapper productMapper;

    /**
     * 新增商品
     * @param productInfo
     */
    public void insertProduct(ProductInfo productInfo) {
        ProductDescript productDescript = new ProductDescript();

        // 插入商品信息
        productMapper.insertProductInfo(productInfo);

        // 插入商品描述信息
        productDescript.setProduct_info_id(productInfo.getId());
        productDescript.setStore_info_id(productInfo.getStore_info_id());
        productDescript.setDescript(productInfo.getDescript());
        productMapper.insertProductDescript(productDescript);

    }
}
