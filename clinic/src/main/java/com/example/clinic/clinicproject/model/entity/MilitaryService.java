package com.example.clinic.clinicproject.model.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Entity(name = "militaryServiceEntity")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString
@Table(name = "military_service")
@SequenceGenerator(name = "MILITARY_SERVICE_SEQ_GENERATOR", sequenceName = "SEQ_MILITARY_SERVICE", initialValue = 1, allocationSize = 10)
public class MilitaryService
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "A1022ID")
    private Long id;

    @Column(name = "A1022CODE", nullable = false, unique = true, columnDefinition = "VARCHAR2(10)")
    private String cardCode;

    @Column(name = "A1022START", nullable = false)
    private LocalDate startDate;

    @Column(name = "A1022END", nullable = false)
    private LocalDate endDate;

    @OneToOne
    @JoinColumn(name = "A1002ID", referencedColumnName = "A1002ID")
    private Staff staff;

    //TODO: writing medicine staff
}