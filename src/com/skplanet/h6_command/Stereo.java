package com.skplanet.h6_command;

/**
 * Created by 1000773 on 2017. 10. 12..
 */
public  class Stereo {
    void on() {
        System.out.println("stereo is on");
    }
    void off(){
        System.out.println("stereo is off");
    }
     void setCD() {
         System.out.println("stereo set CD");
    }
     void setVolume(int volume) {
         System.out.println("stereo set volume : " + volume);
    }
}
