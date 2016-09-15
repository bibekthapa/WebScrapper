package com.example.WebScrapper.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Grabber {

    public String grab(String link) throws IOException {
        URL url = new URL(link);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        // URLConnection conn = url.openConnection();
        BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        //BufferedWriter writer = new BufferedWriter(new FileWriter("C:/users/home/desktop/java/studentrecord.txt"));
        String line = "";
        StringBuilder content = new StringBuilder();
        while ((line = reader.readLine()) != null) {

            content.append(line).append("\n");

        }
        // First regular expression , then pattern and then Matcher
        reader.close();
        return content.toString();
    }

}
