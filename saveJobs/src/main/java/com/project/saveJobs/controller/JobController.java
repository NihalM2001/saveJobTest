package com.project.saveJobs.controller;

import com.project.saveJobs.model.JobModel;
import com.project.saveJobs.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class JobController {
    @Autowired
    JobService jobSer;

    //page link
    @GetMapping("/")
    public String start()
    {
        System.out.println("Home method accessed");
        return "index";
    }

    @GetMapping("/report")
    public String report()
    {
        return "report";
    }

    @GetMapping("/home")
    public String home()
    {
        return "home";
    }


    //controller logic here
    @PostMapping("/saveJob")
    public String saveJob(@ModelAttribute("jobSaver") JobModel jm)
    {
        jobSer.saveJob(jm);
        return "redirect:/home";
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
