package com.project.saveJobs.controller;

import com.project.saveJobs.model.JobModel;
import com.project.saveJobs.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobController {
    @Autowired
    JobService jobSer;

    @PostMapping("/saveJob")
    public JobModel saveJob(@RequestBody JobModel jm)
    {
        return jobSer.saveJob(jm);
    }
}
