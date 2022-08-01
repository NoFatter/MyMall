package com.mall.product;

import com.mall.product.dto.BrandDTO;
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
        BrandDTO brandEntity = new BrandDTO();
        brandEntity.setName("华为");
        brandService.save(brandEntity);
        System.out.println("Success!!");
    }
}
