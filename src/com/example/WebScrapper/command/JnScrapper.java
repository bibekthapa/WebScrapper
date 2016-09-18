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
public class JnScrapper extends Scrapper {

    @Override
    public void scrap() throws IOException {
        String link=("http://www.jobsnepal.com/simple-job-search");
        
        System.out.println("Enter the keyword to search");
        
        Scanner scanner=new Scanner(System.in);
        String params=scanner.next();
       
      
        //Content of regex is of group(0)//Content inside the bracket after job item is group(1) //Content inside the bracket after href is group(2)//Content inside the bracket after \n is group(3)
        String regex="<a class=\"job-item\"(.*?)href=\"(.*?)\"\\s>\\n(.*?)</a>";
        Grabber grabber=new Grabber();
        //Usage of "Keywords=" is very important; Without this code will not work for post method.That means only passing params will not work
        String content=grabber.post(link,"Keywords=".concat(params)); //This take to get method in Grabber
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher=pattern.matcher(content.toString());
        while(matcher.find()){
            
           //writer.write(matcher.group(1).trim()); // writer.append(matcher.group(3).trim());// writer.append("\n");  //System.out.println(matcher);
          System.out.println(matcher.group(2).trim());
            System.out.println(matcher.group(3).trim());
            System.out.println("\n");
            
            
        }
    }

    @Override
    public void grab() throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
