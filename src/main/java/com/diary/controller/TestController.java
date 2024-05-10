package com.diary.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diary.model.Diary;
import com.diary.repo.DiaryRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
@RestController
@RequestMapping("/api")
public class TestController {
	
	@Autowired
	DiaryRepo diaryRepo;
    
    @PostMapping("/entry")
    public String submitForm(@RequestBody Diary formData) {
    
    	 LocalDate currentDate = LocalDate.now();
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
         formData.setDate(currentDate+"");
        
         diaryRepo.save(formData);
         
         
         System.out.println(currentDate);
         
        return "Form data received successfully";
    }
    
    @GetMapping("/entries{game}")
    @ResponseBody
    public Optional<Diary> getMethodName(@RequestParam String game) {
    	
        return diaryRepo.findById(game);
    }
    
}
