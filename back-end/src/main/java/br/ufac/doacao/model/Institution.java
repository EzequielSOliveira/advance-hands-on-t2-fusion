package br.ufac.doacao.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Institution implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;

    // Personal properties

    @Column(nullable = false, unique = true)
    private String corporate_name;

    @Column(nullable = false, unique = true)
    private String fantasy_name;

    @Column(nullable = false, unique = true)
    private String cnpj;

    @Column(nullable = false)
    private String desc_economic_activity;

    @Column(nullable = false)
    private Date opening_date;

    // Address properties

    @Column(nullable = false)
    private String postalCode;

    @Column(nullable = false)
    private String country;

    @Column(nullable = false)
    private String state;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String district;

    @Column(nullable = false)
    private String location;

    @Column(nullable = false)
    private String number;

    @Column(nullable = false)
    private boolean active = false;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCorporate_name() {
        return corporate_name;
    }

    public void setCorporate_name(String corporate_name) {
        this.corporate_name = corporate_name;
    }

    public String getFantasy_name() {
        return fantasy_name;
    }

    public void setFantasy_name(String fantasy_name) {
        this.fantasy_name = fantasy_name;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getDesc_economic_activity() {
        return desc_economic_activity;
    }

    public void setDesc_economic_activity(String desc_economic_activity) {
        this.desc_economic_activity = desc_economic_activity;
    }

    public Date getOpening_date() {
        return opening_date;
    }

    public void setOpening_date(Date opening_date) {
        this.opening_date = opening_date;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

}
