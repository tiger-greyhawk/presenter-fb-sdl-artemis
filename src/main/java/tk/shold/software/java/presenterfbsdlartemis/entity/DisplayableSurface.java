package tk.shold.software.java.presenterfbsdlartemis.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.java.Log;
import sdljava.SDLException;
import sdljava.image.SDLImage;
import sdljava.video.SDLSurface;

@Getter
@Log
public class DisplayableSurface {

    private SDLSurface image;

    public DisplayableSurface(String pathToImage)
    {
        try {
            image = SDLImage.load(pathToImage);
        }
        catch (SDLException e)
        {
            log.warning(e.getMessage());
        }
    }

}
