package com.project.saveJobs.controller;

import com.project.saveJobs.model.JobModel;
import com.project.saveJobs.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/viewJobById/{id}")
    public JobModel viewJobById(@PathVariable long id)
    {
        return jobSer.viewJobByID(id);
    }

    @PutMapping("/editJob")
    public void editJob(@RequestBody JobModel jm)
    {
        jobSer.editJob(jm);
    }


}
