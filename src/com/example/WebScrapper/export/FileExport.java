/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.WebScrapper.export;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author HOME
 */
public class FileExport {
    
    public void addToFile(String params) throws IOException
    {
         String link1="C:/Users/Home/Desktop/java/sample.txt"; 
        File file=new File(link1);
        BufferedWriter writer=new BufferedWriter(new FileWriter(file));
        writer.write(params);
        
        
    
    }
   
    
}
