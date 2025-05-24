package com.example.clinic.clinicproject.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity(name = "phdDegreeEntity")
@Table(name = "phd_degree")
public class PhdDegree extends EducationDegree
{

}