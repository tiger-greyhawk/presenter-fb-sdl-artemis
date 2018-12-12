package tk.shold.software.java.presenterfbsdlartemis;

import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sdljava.SDLException;
import sdljava.SDLMain;
import sdljava.video.SDLSurface;
import sdljava.video.SDLVideo;

@Log
@SpringBootApplication
public class PresenterFbSdlArtemisApplication {

	public static void main(String[] args) {
		System.setProperty("java.library.path", "C:\\_src\\_Java\\presenter-fb-sdl-artemis\\lib");
		log.warning("path1 = " + System.getProperty("java.library.path"));
		System.loadLibrary("SDL");
		System.loadLibrary("SDL_image");
		System.loadLibrary("SDLJava");
		System.loadLibrary("SDLJava_image");



 		SpringApplication.run(PresenterFbSdlArtemisApplication.class, args);
	}
}
