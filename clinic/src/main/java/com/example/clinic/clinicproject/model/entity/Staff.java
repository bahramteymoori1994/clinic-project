package com.example.clinic.clinicproject.model.entity;

import com.example.clinic.clinicproject.model.enums.Gender;
import com.example.clinic.clinicproject.model.enums.IsMarried;
import com.example.clinic.clinicproject.model.enums.IsMilitaryService;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@MappedSuperclass
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString
@SequenceGenerator(name = "STAFF_SEQ_GENERATOR", sequenceName = "SEQ_STAFF", initialValue = 1, allocationSize = 10)
public abstract class Staff
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "STAFF_SEQ_GENERATOR")
    @Column(name = "A1002ID")
    private Long id;

    @Column(name = "A1002FNAME", columnDefinition = "NVARCHAR2(200)", nullable = false)
    private String firstName;

    @Column(name = "A1002LNAME", columnDefinition = "NVARCHAR2(200)", nullable = false)
    private String lastName;

    @Column(name = "A1002NCODE", columnDefinition = "VARCHAR2(10)", nullable = false, unique = true)
    private String nationalCode;

    @Column(name = "A1002GENDER", nullable = false)
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "A1002BDATE", nullable = false)
    private LocalDate birthDate;

    @Column(name = "A1002FTHRNAME", columnDefinition = "NVARCHAR2(200)", nullable = false)
    private String fatherName;

    @Column(name = "A1002ISMARRIED", nullable = false)
    @Enumerated(EnumType.STRING)
    private IsMarried isMarried;

    @Column(name = "A1002ISMILITSERV", nullable = false)
    @Enumerated(EnumType.STRING)
    private IsMilitaryService isMilitaryService;

    @Column(name = "A1002PHONE", nullable = false, columnDefinition = "VARCHAR2(11)", unique = true)
    private String CellphoneNumber;

    @Column(name = "A1002HPHONE", nullable = false, columnDefinition = "VARCHAR2(20)", unique = true)
    private String homePhoneNumber;

    @Column(name = "A1002ADDRESS", nullable = false, columnDefinition = "NVARCHAR2(2000)")
    private String address;
}