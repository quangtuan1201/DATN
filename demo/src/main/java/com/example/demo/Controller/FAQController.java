package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FAQController {
	@GetMapping("/faq")
    public String FAQPage() {
        return "layouts/faq";
    }
}
