package com.ps.spring.security.couponservice.repos;

import com.ps.spring.security.couponservice.model.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponRepo extends JpaRepository<Coupon,Long> {
    Coupon findByCode(String code);
}
