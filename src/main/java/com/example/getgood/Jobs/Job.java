package com.example.getgood.Jobs;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "jobs")
public class Job {

    @Id
    private Integer job_id;
    private  String company;
    private String job_title;

    public Job( String job_title, String company) {
        this.company = company;
        this.job_title = job_title;
    }

    public Job() {

    }
}
