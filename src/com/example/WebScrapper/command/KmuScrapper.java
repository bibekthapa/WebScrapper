
package com.example.WebScrapper.command;

import com.example.WebScrapper.util.Grabber;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class KmuScrapper extends Scrapper {
    
   

    @Override
    public void scrap(String params) throws IOException {
        String link = ("http://www.kaymu.com.np/catalog/?q=".concat(params));
      //  String link1="C:/Users/Home/Desktop/java/sample.txt"; 
      //  File file=new File(link1);
      //  BufferedWriter writer=new BufferedWriter(new FileWriter(file));
       
        String regex = "<h4 class=(.*?)>(.*?)<(.*?)h4>\\n(.*?)<p class=(.*?)>(.*?)</p>";
        

        Grabber grabber = new Grabber() {};
        int i=1;
       
        String content = grabber.get(link);
       // System.out.println(content);
        Pattern pattern = Pattern.compile(regex);
        
        Matcher matcher = pattern.matcher(content.toString());
         
        while (matcher.find()) {
            
     //      writer.write(matcher.group(2).trim());
      //      writer.append("\n");
           
            
     //       writer.write(matcher.group(6).trim());
     //       writer.append("\n");
           
              
                
            System.out.println(i+" " +matcher.group(2).trim());
            
             System.out.println(matcher.group(6).trim());
            
            
            System.out.println("\n");
            i++;
        }
    
       //     writer.close();
    }

    @Override
    public void grab() throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
