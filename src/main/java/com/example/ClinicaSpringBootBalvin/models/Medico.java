package com.example.ClinicaSpringBootBalvin.models;

import jakarta.persistence.*;

@Entity
@Table(name="doctor")
public class Medico {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer doctorId;
    @Column(nullable = false,length = 50)
    private String firstName;
    @Column(nullable = false,length = 50)
    private String lastName;
    @Column(nullable = false,length = 100)
    private String speciality;
    @Column(nullable = false, unique = true)
    private String licenseNumber;
    private String email;
    private String phone;
    @Column(nullable = false)
    private String officeAddress;
    private Integer yearsOfExperience;
    private Boolean status;

    @OneToOne(mappedBy = "medico")
    private TarjetaProfesional tarjetaProfesional;

    public Medico(){
    }

    public Medico(Integer doctorId, String firstName, String lastName, String speciality, String licenseNumber, String email, String phone, String officeAddress, Integer yearsOfExperience, Boolean status) {
        this.doctorId = doctorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.speciality = speciality;
        this.licenseNumber = licenseNumber;
        this.email = email;
        this.phone = phone;
        this.officeAddress = officeAddress;
        this.yearsOfExperience = yearsOfExperience;
        this.status = status;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(String officeAddress) {
        this.officeAddress = officeAddress;
    }

    public Integer getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(Integer yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}