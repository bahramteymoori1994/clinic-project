package com.example.clinic.clinicproject.model.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Entity(name = "jobExperienceEntity")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString
@Table(name = "job_experience")
@SequenceGenerator(name = "JOB_EXPERIENCE_SEQ_GENERATOR", sequenceName = "SEQ_JOB_EXPERIENCE", initialValue = 1, allocationSize = 10)
public class JobExperience
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "A1020ID")
    private Long id;

    @Column(name = "A1020JTITLE", nullable = false, columnDefinition = "NVARCHAR2(200)")
    private String jobTitle;

    @Column(name = "A1020JPLACE", nullable = false, columnDefinition = "NVARCHAR2(200)")
    private String jobPlace;

    @Column(name = "A1020START", nullable = false)
    private LocalDate startDate;

    @Column(name = "A1020END", nullable = false)
    private LocalDate endDate;

    @ManyToOne
    @JoinColumn(name = "A1002ID", referencedColumnName = "A1002ID")
    private Staff staff;
    
    //TODO: write medicine staff
}