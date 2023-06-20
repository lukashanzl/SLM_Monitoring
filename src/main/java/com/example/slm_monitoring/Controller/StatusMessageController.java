package com.example.slm_monitoring.Controller;


import com.example.slm_monitoring.StatusMessage;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusMessageController {
    private StatusMessage statusMessage = new StatusMessage();
    @RequestMapping("/api/message")
    public String statusMessage(){
        return statusMessage.getMessage();
    }
}