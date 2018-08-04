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
public class JobController {
@Id
@GeneratedValue
        
        // zone date time
        private ZonedDateTime zonedDateTime = ZonedDateTime.now();
        
        @javax.persistence.Id
        private Long id;
        private String name;
        private String description;
        private String type;
        private int years_of_experience;
        private String education_level;
        private String status;
        private String interview_date;
        private String interview_start_time;
        private String interview_end_time;

        public JobController(){
            super();
        }
        
        
    public Long getID() {
        return id;
    }

    public void setID(Long id) {
        this.id = id;
    }

    public ZonedDateTime getZonedDateTime() {
        return zonedDateTime;
    }

    public void setZonedDateTime(ZonedDateTime zonedDateTime) {
        this.zonedDateTime = zonedDateTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYears_of_experience() {
        return years_of_experience;
    }

    public void setYears_of_experience(int years_of_experience) {
        this.years_of_experience = years_of_experience;
    }

    public String getEducation_level() {
        return education_level;
    }

    public void setEducation_level(String education_level) {
        this.education_level = education_level;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInterview_date() {
        return interview_date;
    }

    public void setInterview_date(String interview_date) {
        this.interview_date = interview_date;
    }

    public String getInterview_start_time() {
        return interview_start_time;
    }

    public void setInterview_start_time(String interview_start_time) {
        this.interview_start_time = interview_start_time;
    }

    public String getInterview_end_time() {
        return interview_end_time;
    }

    public void setInterview_end_time(String interview_end_time) {
        this.interview_end_time = interview_end_time;
    }
}
