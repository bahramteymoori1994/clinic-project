package com.example.clinic.clinicproject.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity(name = "nurseEntity")
@Table(name = "nurse")
public class Nurse extends MedicineStaff
{

}