package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ForgotPassController {
    @RequestMapping("/forgotpass")
    public String forgot(){{
        return "forgotpass";
    }}
}
