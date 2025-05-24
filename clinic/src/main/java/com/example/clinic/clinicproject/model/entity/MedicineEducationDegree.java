package com.example.clinic.clinicproject.model.entity;

import com.example.clinic.clinicproject.model.enums.MedicalDegreeLevel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity(name = "medicineEducationDegreeEntity")
@Table(name = "medicine_degree")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString
public class MedicineEducationDegree extends EducationDegree
{
    @Column(name = "A1014MEDLEVEL")
    private MedicalDegreeLevel medicalDegreeLevel;

    @Column(name = "A1014HEALTHNUM", columnDefinition = "VARCHAR2(10)")
    private String healthSystemNumber;
}