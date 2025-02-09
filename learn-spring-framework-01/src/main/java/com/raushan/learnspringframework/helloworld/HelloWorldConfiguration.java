package com.raushan.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//Record
//Eliminate verbosity in creating Java Beans
//Public accessor methods, constructor,
//equals, hashcode and toString are automatically created.
//Released in JDK 16.

record Person (String name, int age, Address address) {};

record Address(String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Raushan";
	}
	
	@Bean
	public int age() {
		return 24;
	}
	
	@Bean
	public Person person() {
		return new Person("Radha", 21, new Address("Main Street", "Utrecht"));
	}
	
	//Reusing existing beans managed by Spring framework
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address());
	}
	
	@Bean
	public Person person3Parameters(String name, int age, Address address3) {//name, age,address2
		return new Person(name, age, address3);
	}
	
	@Bean
	@Primary
	public Person person4Parameters(String name, int age, Address address) {//name, age,address2
		return new Person(name, age, address);
	}
	
	@Bean
	public Person person5Qualifier(String name, int age, @Qualifier("address3qualifier") Address address) {
		return new Person(name, age, address);
	}
	
	@Bean(name="address2")
	@Primary
	public Address address() {
		return new Address("Nehru Nagar", "Patna");
	}
	
	@Bean(name="address3")
	@Qualifier("address3qualifier")
	public Address address1() {
		return new Address("Moti Nagar", "Hyderabad");
	}
}
