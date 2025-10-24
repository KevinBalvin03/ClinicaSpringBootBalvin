package com.example.ClinicaSpringBootBalvin.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="clinical_Record")
public class HistoriaClinica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer recordId;
    @Column(nullable = false)
    private LocalDate consultationDate;
    @Column(nullable = false)
    private String reasonForVisit;
    private String vitalSigns;
    @Column(nullable = false)
    private String bloodType;
    private String diagnosis;
    private String treatment;
    private String prescribedMedications;
    private String notes;
    private LocalDate nextAppointment;

    @OneToOne
    @JoinColumn(name = "fk_patientId",referencedColumnName = "patientId")
    private Paciente paciente;

    public HistoriaClinica(){
    }

    public HistoriaClinica(Integer recordId, LocalDate consultationDate, String reasonForVisit, String vitalSigns, String bloodType, String diagnosis, String treatment, String prescribedMedications, String notes, LocalDate nextAppointment, Paciente paciente) {
        this.recordId = recordId;
        this.consultationDate = consultationDate;
        this.reasonForVisit = reasonForVisit;
        this.vitalSigns = vitalSigns;
        this.bloodType = bloodType;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.prescribedMedications = prescribedMedications;
        this.notes = notes;
        this.nextAppointment = nextAppointment;
        this.paciente = paciente;
    }

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public LocalDate getConsultationDate() {
        return consultationDate;
    }

    public void setConsultationDate(LocalDate consultationDate) {
        this.consultationDate = consultationDate;
    }

    public String getReasonForVisit() {
        return reasonForVisit;
    }

    public void setReasonForVisit(String reasonForVisit) {
        this.reasonForVisit = reasonForVisit;
    }

    public String getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(String vitalSigns) {
        this.vitalSigns = vitalSigns;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getPrescribedMedications() {
        return prescribedMedications;
    }

    public void setPrescribedMedications(String prescribedMedications) {
        this.prescribedMedications = prescribedMedications;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public LocalDate getNextAppointment() {
        return nextAppointment;
    }

    public void setNextAppointment(LocalDate nextAppointment) {
        this.nextAppointment = nextAppointment;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}