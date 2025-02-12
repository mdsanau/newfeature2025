package com.patient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatientApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatientApplication.class, args);
		List<String> asList = Arrays.asList("1","2","1","5","6","2");
		System.out.println("before filter "+asList);
		
		HashSet<String> uniqueSet = new HashSet<>(asList);
		ArrayList<String> uniqueElements = new ArrayList<>(uniqueSet);
		
		uniqueElements.forEach(names->System.out.println(names));
		System.out.println("welcome to the world of digital entertainment10" );
		System.out.println("all is well and happy");
		System.out.println("karke dekho kya hota hai");
		System.out.println("new changes integrated");
		System.out.println("hello mister");
//			System.out.println(uniqueElements);
		}
	}


