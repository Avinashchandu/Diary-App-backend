package com.diary.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
@Table(name = "DiaryApp")
public class Diary {

	@Id
	private String date;
	private String title;
	private String content;
	
	
	
}
