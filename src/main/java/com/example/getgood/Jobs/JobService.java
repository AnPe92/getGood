package com.example.getgood.Jobs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepository jobRepository;

    public Job createJob(String title, String company){
        Job job = new Job(title, company);

        return jobRepository.save(job);
    }

    public List<Job> getJobs(){
        return jobRepository.findAll();
    }

}
