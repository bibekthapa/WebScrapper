/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.WebScrapper.command;

import com.example.WebScrapper.util.Grabber;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author HOME
 */
public class JnScrapper extends Scrapper {

    @Override
    public void scrap(String params) throws IOException {
        String link = ("http://www.jobsnepal.com/simple-job-search");

        String link1="C:/Users/Home/Desktop/java/sample.txt"; 
        File file=new File(link1);
        BufferedWriter writer=new BufferedWriter(new FileWriter(file));
       

        String regex = "<a class=\"job-item\"(.*?)href=\"(.*?)\"\\s>\\n(.*?)</a>";
        Grabber grabber = new Grabber() {
        };

        String content = grabber.post(link, "Keywords=".concat(params)); //This take to get method in Grabber
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(content.toString());
        while (matcher.find()) {

            //writer.write(matcher.group(1).trim()); // writer.append(matcher.group(3).trim());// writer.append("\n");  //System.out.println(matcher);
            
            writer.append(matcher.group(2).trim());
            writer.append(matcher.group(3).trim());
            System.out.println(matcher.group(2).trim());
            System.out.println(matcher.group(3).trim());
            System.out.println("\n");

        }
        writer.close();
    }

    @Override
    public void grab() throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    
        

    

    

