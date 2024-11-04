    package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
    public class ProductDetailsController {
    	@RequestMapping("/product-details")
        public String productdetails(){{
            return "layouts/product-details";
        }}
    }

