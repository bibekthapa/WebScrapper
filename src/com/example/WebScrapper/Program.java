package com.example.WebScrapper;

import com.example.WebScrapper.util.Grabber;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program {

    public static void main(String[] args) throws IOException {
       
        
        String link=("http://www.jobsnepal.com/simple-job-search");
        
        System.out.println("Enter the keyword to search");
        
        Scanner scanner=new Scanner(System.in);
        String params=scanner.next();
       
      
        //Content of regex is of group(0)//Content inside the bracket after job item is group(1) //Content inside the bracket after href is group(2)//Content inside the bracket after \n is group(3)
        String regex="<a class=\"job-item\"(.*?)href=\"(.*?)\"\\s>\\n(.*?)</a>";
        Grabber grabber=new Grabber();
        //Usage of "Keywords=" is very important; Without this code will not work for post method.That means only passing params will not work
        String content=grabber.post(link,"Keywords=".concat(params));
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher=pattern.matcher(content.toString());
        while(matcher.find()){
            
           //writer.write(matcher.group(1).trim()); // writer.append(matcher.group(3).trim());// writer.append("\n");  //System.out.println(matcher);
          System.out.println(matcher.group(2).trim());
            System.out.println(matcher.group(3).trim());
            System.out.println("\n");
            
            
        }

         //writer.close();
    }

}
