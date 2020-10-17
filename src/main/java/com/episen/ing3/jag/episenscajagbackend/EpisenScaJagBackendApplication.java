package com.episen.ing3.jag.episenscajagbackend;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EpisenScaJagBackendApplication {

	public static ArrayList<String> chartreuse;
	public static File file; 
	public static Writer write; 

	public static void main(String[] args) throws IOException {
		file = new File("/usr/local/orders.txt"); // path du volume
		write = new FileWriter(EpisenScaJagBackendApplication.file.getPath());
		
		if(!file.exists()) {
			file.createNewFile(); 
		}
		
		chartreuse = new ArrayList<String>();
		SpringApplication.run(EpisenScaJagBackendApplication.class, args);
	
	}

}
