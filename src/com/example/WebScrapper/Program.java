package com.example.WebScrapper;

import com.example.WebScrapper.command.JnScrapper;
import com.example.WebScrapper.command.Scrapper;
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
       
        Scrapper scrapper=new JnScrapper();
        scrapper.scrap();
        

         //writer.close();
    }

}
