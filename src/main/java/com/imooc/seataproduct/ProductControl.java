package com.imooc.seataproduct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: bizy
 * @date: 2021/02/28 16:36
 */
@RestController
public class ProductControl {

    @Autowired
    private ProductService productService;

    @GetMapping("/deduct")
    public Boolean decuct(@RequestParam Long productId,
                          @RequestParam Integer count) {

        productService.deduct(productId,count);
        return true;
    }
}
