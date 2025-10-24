package com.example.ClinicaSpringBootBalvin.models;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name="proffesional_Card")
public class TarjetaProfesional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer professionalCardId;

    @Column(nullable = false)
    private String cardNumer;
    @Column(nullable = false)
    private String proffesion;
    @Column(nullable = false)
    private String issueDate;
    @Column(nullable = false)
    private String placeOfIssue;
    private LocalDate expirationDate;
    private String workEmail;
    private String workPhone;
    @Column(nullable = false)
    private String affiliatedInstitution;
    private Boolean statusCard;

    @OneToOne
    @JoinColumn(name = "fk_idDoctor", referencedColumnName = "doctorId")
    private Medico medico;

    public TarjetaProfesional(){
    }

    public TarjetaProfesional(Integer professionalCardId, String cardNumer, String proffesion, String issueDate, String placeOfIssue, LocalDate expirationDate, String workEmail, String workPhone, String affiliatedInstitution, Boolean statusCard, Medico medico) {
        this.professionalCardId = professionalCardId;
        this.cardNumer = cardNumer;
        this.proffesion = proffesion;
        this.issueDate = issueDate;
        this.placeOfIssue = placeOfIssue;
        this.expirationDate = expirationDate;
        this.workEmail = workEmail;
        this.workPhone = workPhone;
        this.affiliatedInstitution = affiliatedInstitution;
        this.statusCard = statusCard;
        this.medico = medico;
    }

    public Integer getProfessionalCardId() {
        return professionalCardId;
    }

    public void setProfessionalCardId(Integer professionalCardId) {
        this.professionalCardId = professionalCardId;
    }

    public String getCardNumer() {
        return cardNumer;
    }

    public void setCardNumer(String cardNumer) {
        this.cardNumer = cardNumer;
    }

    public String getProffesion() {
        return proffesion;
    }

    public void setProffesion(String proffesion) {
        this.proffesion = proffesion;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getPlaceOfIssue() {
        return placeOfIssue;
    }

    public void setPlaceOfIssue(String placeOfIssue) {
        this.placeOfIssue = placeOfIssue;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getWorkEmail() {
        return workEmail;
    }

    public void setWorkEmail(String workEmail) {
        this.workEmail = workEmail;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    public String getAffiliatedInstitution() {
        return affiliatedInstitution;
    }

    public void setAffiliatedInstitution(String affiliatedInstitution) {
        this.affiliatedInstitution = affiliatedInstitution;
    }

    public Boolean getStatusCard() {
        return statusCard;
    }

    public void setStatusCard(Boolean statusCard) {
        this.statusCard = statusCard;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
}