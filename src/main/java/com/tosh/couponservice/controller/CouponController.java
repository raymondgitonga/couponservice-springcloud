package com.tosh.couponservice.controller;

import com.tosh.couponservice.model.Coupon;
import com.tosh.couponservice.repository.CouponRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/couponapi")
public class CouponController {

    @Autowired
    CouponRepo repo;

    @PostMapping(value = "/coupons")
    public Coupon create(@RequestBody Coupon coupon){
        return repo.save(coupon);
    }

    @GetMapping(value = "/coupons/{code}")
    public Coupon getCoupon(@PathVariable("code") String code){
        return repo.findByCode(code);
    }
}
