package com.cwatts.swapi.service;

import java.io.FileWriter;
import java.time.Instant;

import javax.annotation.PostConstruct;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class FileWritingService {
	public String fileName = "./writing.txt";
	
	// writes a line every few (2) seconds
	@Scheduled(fixedRate = 2000)
	public void writeTimeStamp() {
		try {
			FileWriter writer = new FileWriter(fileName, true);
			writer.write(Instant.now().toString() + "\n");
			writer.close();
		}catch(Exception e) {
			return;
		}
	}
	
	// writes a line on command
	public String writeLine(String line) {
		line = line.trim();
		try {
			FileWriter writer = new FileWriter(fileName, true);
			writer.write(line);
			writer.write("\n");
			writer.close();
			return "Success!";
		} catch (Exception e){
			return "Failure!"; 
		}
	}
	
	@PostConstruct
	public void postConstructor() {
		// reset file to header
		try {
			FileWriter writer = new FileWriter(fileName);
			writer.write("Header Start:\n");
			writer.close();
		}catch(Exception e) {
			return;
		}
	}
}
