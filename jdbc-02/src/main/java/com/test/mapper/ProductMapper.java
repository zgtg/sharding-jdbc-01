package com.test.mapper;

import com.test.entity.ProductDescript;
import com.test.entity.ProductInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ProductMapper {
    /**
     * 新增商品
     * @param productInfo
     * @return
     */
    @Insert("insert into product_info " +
            "   (store_info_id, product_name, spec, region_code, price, img_url)" +
            "   values" +
            "   (#{store_info_id}, #{product_name}, #{spec}, #{region_code}, #{price}, #{img_url})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    int insertProductInfo(ProductInfo productInfo);

    /**
     * 新增商品描述
     * @param productDescript
     * @return
     */
    @Insert("insert into product_info " +
            "   (product_info_id, descript, store_info_id)" +
            "   values" +
            "   (#{product_info_id}, #{descript}, #{store_info_id})")
    int insertProductDescript(ProductDescript productDescript);
}
