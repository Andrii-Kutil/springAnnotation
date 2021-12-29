package com.gmail.kutilandrej.model;

import javax.annotation.PreDestroy;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Scope("singleton")
@Component("musicPlayer")
public class MusicPlayer {
  private String version;
  private String volume;
  @Value("${MusicPlayer.brand}")
  private String brand;
  @Autowired
  @Qualifier("rockMusic")
  private Music genre;

  public MusicPlayer() {
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public String getVolume() {
    return volume;
  }

  public void setVolume(String volume) {
    this.volume = volume;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public Music getGenre() {
    return genre;
  }


  @PostConstruct
  public void myInit() {
    System.out.println("myInit");
  }

  @PreDestroy
  public void myDestroy() {
    System.out.println("myDestroy");
  }

  public  void play(Music music) {
    System.out.println("play: " + music.getName());
  }
}
