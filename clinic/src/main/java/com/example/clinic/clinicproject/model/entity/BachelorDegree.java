package com.example.clinic.clinicproject.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity(name = "bachelorDegreeEntity")
@Table(name = "bachelor_degree")
public class BachelorDegree extends EducationDegree
{

}