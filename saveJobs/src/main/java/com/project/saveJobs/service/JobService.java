package com.project.saveJobs.service;

import com.project.saveJobs.model.JobModel;
import com.project.saveJobs.repository.JobRepository;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
