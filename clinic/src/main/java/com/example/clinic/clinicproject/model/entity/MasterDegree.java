package com.example.clinic.clinicproject.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity(name = "masterDegreeEntity")
@Table(name = "master_degree")
public class MasterDegree extends EducationDegree
{

}