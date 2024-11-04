package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactController {
	@GetMapping("/contact")
    public String contactPage() {
        return "layouts/contact";
    }
}
