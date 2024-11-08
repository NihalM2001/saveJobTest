package com.project.saveJobs.controller;

import com.project.saveJobs.model.JobModel;
import com.project.saveJobs.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JobController {
    @Autowired
    JobService jobSer;

    @PostMapping("/saveJob")
    public JobModel saveJob(@RequestBody JobModel jm)
    {
        return jobSer.saveJob(jm);
    }

    @GetMapping("/listJob")
    public List<JobModel> listAllJob()
    {
        return jobSer.listAllJobs();
    }
}
