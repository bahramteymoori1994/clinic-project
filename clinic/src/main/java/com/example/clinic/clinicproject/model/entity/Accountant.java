package com.example.clinic.clinicproject.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity(name = "accountantEntity")
@Table(name = "accountant")
public class Accountant extends Staff
{

}