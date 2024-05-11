package com.raushan.springboot.learnjpaandhibernate.course;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.raushan.springboot.learnjpaandhibernate.course.Course;
import com.raushan.springboot.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.raushan.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.raushan.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{
	
//	@Autowired
//	private CourseJdbcRepository repository;
	
//	@Autowired
//	private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.save(new Course(1, "Learn AWS Now!", "in 28minutes"));
		repository.save(new Course(2, "Learn Azure Now!", "in 28minutes"));
		repository.save(new Course(3, "Learn Devops Now!", "in 28minutes"));
//		repository.deleteById(1l);
		
//		System.out.println(repository.findById(2l));
//		System.out.println(repository.findById(3l));
		
//		System.out.println(repository.findAll());
//		System.out.println(repository.count());
//		
//		System.out.println(repository.findByAuthor("in 28minutes"));
//		System.out.println(repository.findByAuthor(""));
		System.out.println(repository.findByName("Learn Azure Now!"));


	}
	
}
