/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.WebScrapper.command;

import com.example.WebScrapper.util.Grabber;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author HOME
 */
public class MjScrapper extends Scrapper {

    @Override
    public void scrap(String params) throws IOException {
        
        
        String link = ("http://www.merojob.com/search-new/index.php?search=".concat(params));
        String link1="C:/Users/Home/Desktop/java/sample.txt"; 
        File file=new File(link1);
        BufferedWriter writer=new BufferedWriter(new FileWriter(file));
       
        String regex = "<h4 class=(.*?)>(.*?)<(.*?)h4>\\n(.*?)<p class=(.*?)>(.*?)</p>";
        

        Grabber grabber = new Grabber() {};
        int i=1;
       
        String content = grabber.get(link);
       // System.out.println(content);
        Pattern pattern = Pattern.compile(regex);
        
        Matcher matcher = pattern.matcher(content.toString());
         
        while (matcher.find()) {
            
           writer.write(matcher.group(2).trim());
           writer.append("\n");
           writer.append("\n");
            
            writer.write(matcher.group(6).trim());
              
                
            System.out.println(i+" " +matcher.group(2).trim());
            
             System.out.println(matcher.group(6).trim());
            
            
            System.out.println("\n");
            i++;
        }
    
            writer.close();
    }

    public void write() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:/users/home/desktop/java/studentrecord.txt)"));

    }

    @Override
    public void grab() throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
