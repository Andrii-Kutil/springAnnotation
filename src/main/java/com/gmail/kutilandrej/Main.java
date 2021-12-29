package com.gmail.kutilandrej;

import com.gmail.kutilandrej.config.SpringConfig;
import com.gmail.kutilandrej.model.Music;
import com.gmail.kutilandrej.model.MusicPlayer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
  public static void main(String... args) {
    //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

    Music music = context.getBean("rockMusic", Music.class);
    music.setName("ROCK");
    System.out.println("brand: " + musicPlayer.getBrand());
    musicPlayer.play(music);

    context.close();
  }
}
