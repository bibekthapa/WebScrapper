/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.WebScrapper;

import com.example.WebScrapper.command.HamroScrapper;
import com.example.WebScrapper.command.JnScrapper;
import com.example.WebScrapper.command.MjScrapper;
import com.example.WebScrapper.command.Scrapper;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class Controller {
    
    
     
     // some method must be there for Implementation such as add
     void add() throws IOException
     {
         System.out.println("Enter the keyword to search");
        Scanner scanner=new Scanner(System.in);
        String params= scanner.next();
    
    /* Scrapper scrapper=new MjScrapper();
        scrapper.scrap(params);
        
        Scrapper scrapper1=new JnScrapper();
        scrapper1.scrap(params);
      */  
        Scrapper hamroscrapper=new HamroScrapper();
        hamroscrapper.scrap(params);
     }
}
