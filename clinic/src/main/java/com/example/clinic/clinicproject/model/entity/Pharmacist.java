package com.example.clinic.clinicproject.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity(name = "pharmacistEntity")
@Table(name = "pharmacist")
public class Pharmacist extends MedicineStaff{
}
