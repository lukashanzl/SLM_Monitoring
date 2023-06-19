package com.example.slm_monitoring.Controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatusMessageControllerTest {
    @Test
    void getStatusMessage(){
        // Arrange
        StatusMessageController controller = new StatusMessageController();

        // Act
        String result = controller.statusMessage();

        // Assert
        assertEquals("Everything works as expected",result);
    }
}