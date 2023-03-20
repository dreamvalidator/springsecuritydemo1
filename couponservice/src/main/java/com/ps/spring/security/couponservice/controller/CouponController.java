package com.ps.spring.security.couponservice.controller;

import com.ps.spring.security.couponservice.model.Coupon;
import com.ps.spring.security.couponservice.repos.CouponRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( "/couponapp")
public class CouponController {
    @Autowired
    private  CouponRepo couponRepo;
    @PostMapping
    @RequestMapping("/createCoupon")
    public Coupon create(@RequestBody Coupon coupon){
      return couponRepo.save(coupon) ;
    }

    @GetMapping("/coupon/{code}")
    public Coupon getCoupon(@PathVariable("code") String code){

        return couponRepo.findByCode(code);
    }

}
