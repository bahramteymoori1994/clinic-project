package com.example.clinic.clinicproject.model.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Entity(name = "bankAccountEntity")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString
@Table(name = "bank_account")
@SequenceGenerator(name = "BANK_ACCOUNT_SEQ_GENERATOR", sequenceName = "SEQ_BANK_ACCOUNT", initialValue = 1, allocationSize = 10)
public class BankAccount
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "A1021ID")
    private Long id;

    @Column(name = "A1021BNAME", nullable = false, columnDefinition = "NVARCHAR2(200)")
    private String bankName;

    @Column(name = "A1021CARDNUM", nullable = false, unique = true, columnDefinition = "VARCHAR2(16)")
    private String cardNumber;

    @Column(name = "A1021SHEBA", nullable = false, unique = true, columnDefinition = "VARCHAR2(26)")
    private String shebaNumber;

    @Column(name = "A1021CVV2", nullable = false, columnDefinition = "VARCHAR2(4)")
    private String cvv2;

    @Column(name = "A1021EXPDATE", nullable = false)
    private LocalDate expiredDate;

    @ManyToOne
    @JoinColumn(name = "A1002ID", referencedColumnName = "A1002ID")
    private Staff staff;

    //TODO: writing medicine staff
}