package com.example.slm_monitoring.Controller;

import org.springframework.web.bind.annotation.GetMapping;

public class StatusMessageController {
    @GetMapping("/api/message")
    public String statusMessage(){
        return "Everything works as expected";
    }
}
