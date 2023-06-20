package com.example.slm_monitoring;

public class StatusMessage {
    private String message = "Everything works as expected";

    public StatusMessage(){};

    public StatusMessage(String message){
        this.message = message;
    }

    public StatusMessage(StatusMessage statusMessage){
        this.message = statusMessage.getMessage();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
