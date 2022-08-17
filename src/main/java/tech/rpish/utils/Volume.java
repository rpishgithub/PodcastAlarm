package tech.rpish.utils;

import java.io.IOException;

public class Volume {
    public static void setMaxVolume() throws IOException {
        Process process = new ProcessBuilder("src/main/resources/nircmd-x64/nircmd.exe", "setsysvolume", "65535").start();
    }
}
