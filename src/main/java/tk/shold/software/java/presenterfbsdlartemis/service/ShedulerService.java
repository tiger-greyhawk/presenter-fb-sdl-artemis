package tk.shold.software.java.presenterfbsdlartemis.service;

import org.springframework.stereotype.Component;

@Component
public class ShedulerService {
    private DrawScreenService drawScreenService;

    public ShedulerService(DrawScreenService drawScreenService) {
        this.drawScreenService = drawScreenService;
        drawScreenService.drawToScreen();
    }
}
