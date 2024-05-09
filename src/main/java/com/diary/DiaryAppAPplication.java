package com.diary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.diary.model")
@EnableJpaRepositories("com.diary.repo")
public class DiaryAppAPplication {

	public static void main(String[] args) {
		SpringApplication.run(DiaryAppAPplication.class, args);
	}

}
