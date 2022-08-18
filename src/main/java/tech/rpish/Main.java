package tech.rpish;

import tech.rpish.utils.Browser;
import tech.rpish.utils.Selector;
import tech.rpish.utils.Volume;

import java.io.IOException;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException {
//        Browser.browse("https://www.youtube.com/watch?v=keDmCLs00ps");
//        System.out.println(Selector.random());

        Volume.setMaxVolume();
        Browser.browse(Selector.random());
    }
}
