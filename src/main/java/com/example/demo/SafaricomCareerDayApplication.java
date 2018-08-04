package com.example.demo;

//import statements
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import org.springframework.data.annotation.Id;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.UUID;
import java.time.ZonedDateTime;


@SpringBootApplication
public class SafaricomCareerDayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SafaricomCareerDayApplication.class, args);
                
//                entities
    @Entity
    class Student {
        @Id
        @GeneratedValue
        UUID uuid = UUID.randomUUID();
//        zone date time
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        
        private String id = uuid.toString();
        private int date_created = ZonedDateTime.now().getDayOfMonth();
        private String firstname;
        private String lastname;
        private char email;
        private String gender;
    }



	}
}
