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
    @Test
    void resetStatusMessage(){
        // Arrange
        StatusMessageController controller = new StatusMessageController();

        // Act
        String result = controller.resetStatusMessage();
        String result2 = controller.statusMessage();

        // Assert
        assertEquals("ok",result);
        assertEquals("Everything works as expected",result2);
    }

    @Test
    void setStatusMessage(){
        // Arrange
        StatusMessageController controller = new StatusMessageController();

        // Act
        String result = controller.setMessage("Hello");
        String result2 = controller.statusMessage();

        // Assert
        assertEquals("ok",result);
        assertEquals("Hello",result2);
    }
}