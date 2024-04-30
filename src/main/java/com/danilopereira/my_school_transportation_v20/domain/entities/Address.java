package com.danilopereira.my_school_transportation_v20.domain.entities;

import java.util.UUID;

public class Address {
    private UUID id;
    private String city;
    private String district;
    private String street;
    private String referencePoint;
    private String houseNumber;

    private Student student;

    public Address(UUID id, String city, String district, String street, String referencePoint, String houseNumber, Student student) {
        setId(id);
        setCity(city);
        setDistrict(district);
        setStreet(street);
        setReferencePoint(referencePoint);
        setHouseNumber(houseNumber);
        setStudent(student);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        if (id == null) this.id = UUID.randomUUID();
        else this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (city.isEmpty()) throw new IllegalArgumentException("City cannot be empty.");
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        if (district.isEmpty()) throw new IllegalArgumentException("District cannot be empty.");
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        if (street.isEmpty()) throw new IllegalArgumentException("Street cannot be empty.");
        this.street = street;
    }

    public String getReferencePoint() {
        return referencePoint;
    }

    public void setReferencePoint(String referencePoint) {
        if (referencePoint.isEmpty()) this.referencePoint = "S/ Ref";
        else this.referencePoint = referencePoint;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        if (houseNumber.isEmpty()) this.houseNumber = "S/ Num";
        else this.houseNumber = houseNumber;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        if (student == null) throw new IllegalArgumentException("Student cannot be null");
        this.student = student;
    }
}
