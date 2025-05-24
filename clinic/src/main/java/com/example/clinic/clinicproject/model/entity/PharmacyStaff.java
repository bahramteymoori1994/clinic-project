package com.example.clinic.clinicproject.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity(name = "pharmacyStaffEntity")
@Table(name = "pharmacy_staff")
public class PharmacyStaff extends Staff{
}
