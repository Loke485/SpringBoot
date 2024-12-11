package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Table(name = "USER_MASTER") 
@Data 
@AllArgsConstructor 
public class User { 
	public User() {
		
	}
public User( Integer userid, String username,String gender,int age,String country) {
		this.userid=userid;
		this.username= username;
		this.gender = gender;
		this.age = age;
		this.country=country;
	}
@Id
 @Column(name = "USER_ID") 
 private Integer userid; 
@Column(name = "USER_NAME") 
 private String username; 
 @Column(name = "USER_GENDER") 
 private String gender; 
 @Column(name = "USER_AGE") 
 private Integer age; 
 @Column(name = "USER_COUNTRY") 
 private String country; 
} 