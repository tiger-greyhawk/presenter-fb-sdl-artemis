package tk.shold.software.java.presenterfbsdlartemis;

import lombok.extern.java.Log;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sdljava.SDLException;
import sdljava.image.SDLImage;
import sdljava.video.SDLSurface;
import sdljava.video.SDLVideo;

import javax.annotation.PostConstruct;

@Log
@Configuration
public class AppConfiguration {

    @PostConstruct
    public void init() {
        //System.setProperty("java.library.path", "./lib/win");
        System.loadLibrary("SDL");
        System.loadLibrary("SDL_image");
        System.loadLibrary("SDLJava");
        System.loadLibrary("SDLJava_image");
    }

    @Bean
    public SDLSurface getSurface()
    {
        SDLSurface surface = null;
        try {
            return SDLImage.load("./src/main/resources/ball.bmp");
        }
        catch (SDLException e)
        {
            log.warning(e.getMessage());
        }
        return surface;
    }
}
