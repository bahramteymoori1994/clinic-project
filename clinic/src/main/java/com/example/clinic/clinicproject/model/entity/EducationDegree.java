package com.example.clinic.clinicproject.model.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@MappedSuperclass
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString
@SequenceGenerator(name = "EDUCATION_DEGREE_SEQ_GENERATOR", sequenceName = "SEQ_EDUCATION_DEGREE", initialValue = 1, allocationSize = 10)
public abstract class EducationDegree
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "A1014ID")
    private Long id;

    @Column(name = "A1014CODE", nullable = false, columnDefinition = "VARCHAR2(10)", unique = true)
    private String degreeCode;

    @Column(name = "A1014MAJOR", nullable = false, columnDefinition = "NVARCHAR2(200)")
    private String major;

    @Column(name = "A1014UNIVERSITY", columnDefinition = "NVARCHAR2(200)")
    private String universityName;

    @Column(name = "A1014AVERAGE", columnDefinition = "NUMBER(4, 2)", nullable = false)
    private Double average;

    @Column(name = "A1014START", nullable = false)
    private LocalDate startDate;

    @Column(name = "A1014END", nullable = false)
    private LocalDate endDate;

    @ManyToOne
    @JoinColumn(name = "A1002ID", referencedColumnName = "A1002ID")
    private Staff staff;
}