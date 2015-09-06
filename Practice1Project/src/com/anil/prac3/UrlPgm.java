package com.anil.prac3;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;


/**
 * Created by This1 on 29/08/2015.
 */
public class UrlPgm {

    private static final String FLOWERS_FEED = "http://services.hanselandpetal.com/feeds.xml";

    public static void main(String[] args) {

        InputStream stream = null;
        BufferedInputStream buf = null;

        try {
            URL url = new URL(FLOWERS_FEED);
            stream = url.openStream();
            buf = new BufferedInputStream(stream);

            StringBuilder sb = new StringBuilder();
            while (true) {
                int data = buf.read();

                if (data == -1) {
                    break;
                } else
                    sb.append((char) data);

            }
            System.out.println(sb);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }


    }
}
