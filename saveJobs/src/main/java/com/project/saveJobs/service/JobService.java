package com.project.saveJobs.service;

import com.project.saveJobs.model.JobModel;
import com.project.saveJobs.repository.JobRepository;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Data
public class JobService {
    @Autowired
    JobRepository jobRepo;

    public JobModel saveJob(JobModel jm)
    {
        return jobRepo.save(jm);
    }

    public List<JobModel> listAllJobs()
    {
        return jobRepo.findAll();
    }

    public JobModel viewJobByID(long id)
    {
        return jobRepo.findById(id).get();
    }

    public void editJob(JobModel jm)
    {
        JobModel jobModel = new JobModel();
        boolean flag =  jobRepo.findById(jm.getSNo()).isPresent();
        if(flag)
        {
            jobModel.setCallback(jm.getCallback());
            jobModel.setInterview(jm.getInterview());
            jobModel.setSelected(jm.getSelected());
            jobRepo.save(jm);
        }
    }
}
