package com.example.clinic.clinicproject.model.entity;

import com.example.clinic.clinicproject.model.enums.IsSickBefore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Entity(name = "patientEntity")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString
@Table(name = "patient")
@SequenceGenerator(name = "PATIENT_SEQ_GENERATOR", sequenceName = "SEQ_PATIENT", initialValue = 1, allocationSize = 10)
public class Patient
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "PATIENT_SEQ_GENERATOR")
    @Column(name = "A1001ID")
    private Long id;

    @Column(name = "A1001FNAME", nullable = false, columnDefinition = "NVARCHAR2(200)")
    private String firstName;

    @Column(name = "A1001LNAME", nullable = false, columnDefinition = "NVARCHAR2(200)")
    private String lastName;

    @Column(name = "A1001NCODE", nullable = false, columnDefinition = "VARCHAR2(10)", unique = true)
    private String nationalCode;

    @Column(name = "A1001BDATE", nullable = false)
    private LocalDate birthDate;

    @Column(name = "A1001PHONE", nullable = false, columnDefinition = "VARCHAR2(11)", unique = true)
    private String phoneNumber;

    @Column(name = "A1001ISSICKBEF", nullable = false)
    @Enumerated(EnumType.STRING)
    private IsSickBefore isSickBefore;

    @Column(name = "A1001SICKDESC", columnDefinition = "NVARCHAR2(200)")
    private String sickDescription;
}