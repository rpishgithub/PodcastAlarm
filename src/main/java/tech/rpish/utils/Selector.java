package tech.rpish.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Selector {
    public static String random() throws IOException {
        List<String> playlist = new ArrayList<>();
        Random random = new Random();
        int randomIndex;

//        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/resources/playlist.txt"));
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\79825\\Documents\\IdeaProjects\\PodcastAlarm\\src\\main\\resources\\playlist.txt"));
        String line = bufferedReader.readLine();
        while (line != null) {
            playlist.add(line);
            line = bufferedReader.readLine();
        }
        bufferedReader.close();

        randomIndex = random.ints(0, playlist.size()).findFirst().getAsInt();

        return playlist.get(randomIndex);
    }
}
