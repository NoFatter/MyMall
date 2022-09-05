package com.mall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mall.product.dto.BrandDTO;
import com.mall.product.entity.BrandEntity;
import com.mall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductApplicationTest {
    @Autowired
    BrandService brandService;
    @Test
    public void contextLoads(){
        BrandEntity brandEntity = new BrandEntity();
        /**
         * 按id查找
         */
        brandEntity = brandService.selectById(2L);
        System.out.println(brandEntity);
//        /**
//         * list查询dto
//         */
//        Map<String,Object> mapper = new HashMap<>();
//
//        mapper.put(brand_id,2);
//        List<BrandDTO> list = brandService.list(mapper);
//        for(BrandDTO brandDTO:list){
//            System.out.println(brandDTO);
//        }
        /**
         * 修改
         */
//        brandEntity.setBrandId(3L);
//        brandEntity.setDescript("爱国");
//        brandService.updateById(brandEntity);
        /**
         *  插入
         */
//        brandEntity.setName("华为");
//        brandService.insert(brandEntity);

        System.out.println("Success!!");
    }
}
