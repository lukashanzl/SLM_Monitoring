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

    @RequestMapping("/api/message/reset")
    public String resetStatusMessage(){
        statusMessage = new StatusMessage();
        return "ok";
    }

    @RequestMapping("/api/message/set")
    public String setMessage(String m) {
        statusMessage.setMessage(m);
        return "ok";
    }
}