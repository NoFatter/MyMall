package com.mall.product;

import com.mall.product.entity.BrandEntity;
import com.mall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductApplicationTest {
    @Autowired
    BrandService brandService;
    @Test
    public void contextLoads(){
        BrandEntity brandEntity = new BrandEntity();
        /**
            
         */
        /**
         * 修改
         */
        brandEntity.setBrandId(3L);
        brandEntity.setDescript("爱国");
        brandService.updateById(brandEntity);
        /**
         *  插入
         */
//        brandEntity.setName("华为");
//        brandService.insert(brandEntity);

        System.out.println("Success!!");
    }
}
