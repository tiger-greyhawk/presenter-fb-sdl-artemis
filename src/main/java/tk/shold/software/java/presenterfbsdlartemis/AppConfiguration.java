package tk.shold.software.java.presenterfbsdlartemis;

import lombok.extern.java.Log;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tk.shold.software.java.presenterfbsdlartemis.entity.DisplayableSurface;


import javax.annotation.PostConstruct;

@Log
@Configuration
public class AppConfiguration {

    @PostConstruct
    public void init() {

    }

    @Bean
    public DisplayableSurface displayableSurface()
    {
        return new DisplayableSurface("./src/main/resources/ball.bmp");
    }
}
