/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.WebScrapper.command;

import com.example.WebScrapper.util.Grabber;
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
    public void scrap() throws IOException {
        
        String link=("http://www.merojob.com");
        
        System.out.println("Enter the keyword to search");
        
        Scanner scanner=new Scanner(System.in);
        String params=scanner.next();
       
      
        //Content of regex is of group(0)//Content inside the bracket after job item is group(1) //Content inside the bracket after href is group(2)//Content inside the bracket after \n is group(3)
        String regex="<div class='(.*?)><strong>(.*?)</strong><(.*?)><li><a href='(.*?)'\\starget='(.*?)>(.*?)</a>";

                

        Grabber grabber=new Grabber();
        //Usage of "Keywords=" is very important; Without this code will not work for post method.That means only passing params will not work
        String content=grabber.get(link);
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher=pattern.matcher(content.toString());
        while(matcher.find()){
            
           //writer.write(matcher.group(1).trim()); // writer.append(matcher.group(3).trim());// writer.append("\n");  //System.out.println(matcher);
          System.out.println(matcher.group(2).trim());
            System.out.println(matcher.group(4).trim());
            System.out.println(matcher.group(6).trim());
            System.out.println("\n");
            
            
        }
        
    }
    
}
