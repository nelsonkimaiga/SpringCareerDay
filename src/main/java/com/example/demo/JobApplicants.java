/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import java.time.ZonedDateTime;
import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import org.springframework.data.annotation.Id;

/**
 *
 * @author Kimaiga
 */

@Entity
public class JobApplicants {


        
//uuid object
UUID uuid = UUID.randomUUID();
        
        // zone date time
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        
    @javax.persistence.Id
        private String id;
        private String first_name;
        private String last_name;
        private char email;
        private int phone;
        private String education_level;
        private int years_of_experience;
        private int date_created;

        public JobApplicants (){
            super();
        
        }
        
        public JobApplicants (String id, String first_name, String last_name, char email, int phone, String education_level, int years_of_experience, int date_created){
            super();
            this.id = id;
            this.first_name = first_name;
            this.last_name = last_name;
            this.email = email;
            this.phone = phone;
            this.education_level = education_level;
            this.years_of_experience = years_of_experience;
            this.date_created = date_created;
        }
        
    public String getId() {
        return uuid.toString();
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getFirstName(){
        return first_name;
    }
    
    public void setFirstName(String first_name){
       this.first_name = first_name;
    }
    
    public String getLastName(){
        return last_name;
    }
    
    public void setLastName(String last_name){
       this.last_name = last_name;
    }
    
    public char getEmail(){
        return email;
    }
    
    public void setEmail(char email){
       this.email = email;
    }
    
    public int getPhone(){
        return phone;
    }
    
    public void setPhone(int phone){
       this.phone = phone;
    }
    
    public String getEducation(){
        return education_level;
    }
    
    public void setEducation(String education_level){
       this.education_level = education_level;
    }
    
    public int getYearsofExperience(){
        return years_of_experience;
    }
    
    public void setYearsofExperience(int years_of_experience){
       this.years_of_experience = years_of_experience;
    }
    
    public int getDateCreated(){
        return date_created;
    }
    
    public void setDateCreated(int date_created){
       this.date_created = date_created;
    }
    
    
}
