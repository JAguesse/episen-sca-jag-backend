package com.episen.ing3.jag.episenscajagbackend.controller;

import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.episen.ing3.jag.episenscajagbackend.EpisenScaJagBackendApplication;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

import lombok.extern.slf4j.Slf4j;
@RestController
@Slf4j
@JsonAutoDetect
public class Controller {
	
	
	
	@PostMapping("/add/order")
	@ResponseBody
	public ResponseEntity<String> createTweet(@RequestBody String chat) throws IOException {
		log.info(chat.toString());
		EpisenScaJagBackendApplication.chartreuse.add(chat);
		EpisenScaJagBackendApplication.write.write(chat + System.lineSeparator());
		EpisenScaJagBackendApplication.write.flush();
		return ResponseEntity.ok(chat);

	}

	@GetMapping("/monChat")
	@ResponseBody
	public ResponseEntity<String> createTweet() {
		try {
			return ResponseEntity.ok(EpisenScaJagBackendApplication.chartreuse.get(EpisenScaJagBackendApplication.chartreuse.size()-1));
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null; 
	}

}
