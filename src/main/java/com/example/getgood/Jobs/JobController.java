package com.example.getgood.Jobs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JobController {

    @Autowired
    private JobService jobService;

    @PostMapping("/jobs")
    public Job createJob(@RequestBody CreateJobRequest request){
        return  jobService.createJob(request.getJobTitle(),request.getCompany());
    }

    @GetMapping("/jobs")
    public List<Job> getJobs(){
        return jobService.getJobs();
    }

    @GetMapping("/")
    public String test(){
        return " test";
    }
}
