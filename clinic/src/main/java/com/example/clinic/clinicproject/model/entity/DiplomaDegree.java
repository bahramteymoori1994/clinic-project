package com.example.clinic.clinicproject.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity(name = "diplomaDegreeEntity")
@Table(name = "diploma_degree")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString
public class DiplomaDegree extends EducationDegree
{
    @Column(name = "A1014SCHOOL", columnDefinition = "NVARCHAR2(200)")
    private String schoolName;
}