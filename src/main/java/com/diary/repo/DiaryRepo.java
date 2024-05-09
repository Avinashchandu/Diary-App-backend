package com.diary.repo;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.diary.model.Diary;

public interface DiaryRepo extends JpaRepository<Diary, String>{
	
	

}
