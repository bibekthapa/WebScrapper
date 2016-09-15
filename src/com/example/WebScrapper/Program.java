package com.example.WebScrapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program {

    public static void main(String[] args) throws IOException {
        URL url = new URL("http://www.jobsnepal.com");
        URLConnection conn = url.openConnection();
        BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line = "";
        StringBuilder content = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            content.append(line).append("\n");

        }
        // First regular expression , then pattern and then Matcher
        reader.close();
        String regex="<a class=\"job-item\"(.*?)href=\"(.*?)\"\\s>\\n(.*?)</a>";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher=pattern.matcher(content.toString());
        while(matcher.find()){
           //System.out.println(matcher);
          System.out.println(matcher.group().trim());
        }

    }

}
