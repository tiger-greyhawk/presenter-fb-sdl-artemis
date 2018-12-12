package tk.shold.software.java.presenterfbsdlartemis.service;

import lombok.extern.java.Log;
import org.springframework.stereotype.Component;
import sdljava.SDLException;
import sdljava.SDLMain;
import sdljava.video.SDLSurface;
import sdljava.video.SDLVideo;
import tk.shold.software.java.presenterfbsdlartemis.entity.DisplayableSurface;

import javax.annotation.PreDestroy;

@Log
@Component
public class DrawScreenService {
    private SDLSurface imageToDraw;



    public DrawScreenService(DisplayableSurface imageToDraw) {
        this.imageToDraw = imageToDraw.getImage();
    }

    public void drawToScreen()
    {
        try {
            SDLSurface screen = getSurface();
            imageToDraw.blitSurface(screen);
            screen.flip();
            log.warning("done");
            try {
                Thread.sleep(10000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        catch (SDLException e)
        {
            log.warning(e.getMessage());
        }
        finally {

        }
    }

    private SDLSurface getSurface()
    {
        SDLSurface screen = null;
        try {
            SDLMain.init(SDLMain.SDL_INIT_VIDEO);
            screen = SDLVideo.setVideoMode(1024,768, 24, SDLVideo.SDL_SWSURFACE);
        } catch (SDLException e) {
            e.printStackTrace();
        }
        return screen;
    }

    @PreDestroy
    public void destroySdlObjects()
    {
        log.info("try to destroy SDLObjects");
        try {
            imageToDraw.freeSurface();
            SDLMain.quit();
            log.info("destroy SDLObjects successful");
        } catch (SDLException e) {
            e.printStackTrace();
        }
    }
}
