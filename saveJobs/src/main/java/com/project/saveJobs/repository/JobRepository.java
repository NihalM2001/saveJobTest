package com.project.saveJobs.repository;

import com.project.saveJobs.model.JobModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<JobModel, Long> {
    
}
