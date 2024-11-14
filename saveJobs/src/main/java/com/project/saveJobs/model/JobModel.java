package com.project.saveJobs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "JobDetails")
public class JobModel {
    @Id
    @GeneratedValue
    private long sNo;
    private String companyName;
    private String roleName;
    private long salary;
    private String appliedDate;
    private String callback;
    private String interview;
    private String selected;
}
