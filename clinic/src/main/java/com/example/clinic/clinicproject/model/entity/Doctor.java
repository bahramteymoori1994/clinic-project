package com.example.clinic.clinicproject.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity(name = "doctorEntity")
@Table(name = "doctor")
public class Doctor extends MedicineStaff
{

}