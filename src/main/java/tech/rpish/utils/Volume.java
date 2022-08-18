package tech.rpish.utils;

import java.io.IOException;

public class Volume {
    public static void setMaxVolume() throws IOException {
//        Process process = new ProcessBuilder("src/main/resources/nircmd-x64/nircmd.exe", "setsysvolume", "65535").start();
        Process process = new ProcessBuilder("C:\\Users\\79825\\Documents\\IdeaProjects\\PodcastAlarm\\src\\main\\resources\\nircmd-x64\\nircmd.exe", "setsysvolume", "65535").start();
    }
}
