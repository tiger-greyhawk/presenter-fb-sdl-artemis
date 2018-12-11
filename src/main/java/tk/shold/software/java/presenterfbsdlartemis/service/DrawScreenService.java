package tk.shold.software.java.presenterfbsdlartemis.service;

import org.springframework.stereotype.Service;
import sdljava.video.SDLSurface;

@Service
public class DrawScreenService {
    private SDLSurface imageToDraw;

    public DrawScreenService(SDLSurface imageToDraw) {
        this.imageToDraw = imageToDraw;
    }
}
