package com.ps.spring.security.productservice.controller;

import com.ps.spring.security.productservice.dto.CouponDto;
import com.ps.spring.security.productservice.model.Product;
import com.ps.spring.security.productservice.repository.ProductRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/productapp")
public class ProductController{
    @Autowired
     private ProductRepos productRepos;
    @Autowired
    private RestTemplate restTemplate;
    @PostMapping("/createProduct")
    public  Product createProduct(@RequestBody Product product){
       CouponDto coupon= restTemplate.getForObject("http://localhost:9080/couponapp/coupon/" +product.getCode(), CouponDto.class);
        product.setPrice(product.getPrice().subtract(coupon.getDiscount()));
        return productRepos.save(product);

    }
}
