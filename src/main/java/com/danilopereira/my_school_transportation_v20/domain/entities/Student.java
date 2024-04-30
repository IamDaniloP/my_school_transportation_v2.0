package com.danilopereira.my_school_transportation_v20.domain.entities;

import com.danilopereira.my_school_transportation_v20.domain.enums.Shift;
import com.danilopereira.my_school_transportation_v20.domain.enums.TransportationType;
import com.danilopereira.my_school_transportation_v20.domain.exceptions.InvalidShiftException;
import com.danilopereira.my_school_transportation_v20.domain.exceptions.InvalidTransportationTypeException;

import java.util.List;
import java.util.UUID;

public class Student {
    private UUID id;
    private String name;
    private String school;
    private String grade;
    private Shift shift;
    private TransportationType transportationType;
    private Responsible responsible;
    private Address address;
    private Conductor conductor;
    private List<Payment> paymentList;

    // Permite criar o estudante sem nenhum pagamento vinculado a ele.
    public Student(UUID id, String name, String school, String grade, String shift, String transportationType, Responsible responsible, Address address, Conductor conductor) {
        setId(id);
        setName(name);
        setSchool(school);
        setGrade(grade);
        setShift(shift);
        setTransportationType(transportationType);
        setResponsible(responsible);
        setAddress(address);
        setConductor(conductor);
    }

    public Student(UUID id, String name, String school, String grade, String shift, String transportationType, Responsible responsible, Address address, Conductor conductor, List<Payment> paymentList) {
        setId(id);
        setName(name);
        setSchool(school);
        setGrade(grade);
        setShift(shift);
        setTransportationType(transportationType);
        setResponsible(responsible);
        setAddress(address);
        setConductor(conductor);
        setPaymentList(paymentList);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        if (id == null) this.id = UUID.randomUUID();
        else this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) throw new IllegalArgumentException("Name cannot be empty");
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        if (school.isEmpty()) throw new IllegalArgumentException("School cannot be empty");
        this.school = school;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        if (grade.isEmpty()) throw new IllegalArgumentException("Grade cannot be empty");
        this.grade = grade;
    }

    public Shift getShift() {
        return shift;
    }

    public void setShift(String shift) {
        if (shift.equalsIgnoreCase("MANHA")) this.shift = Shift.MANHA;
        else if (shift.equalsIgnoreCase("TARDE")) this.shift = Shift.TARDE;
        else throw new InvalidShiftException();
    }

    public TransportationType getTransportationType() {
        return transportationType;
    }

    public void setTransportationType(String transportationType) {
        if (transportationType.equalsIgnoreCase("IDA E VOLTA") || transportationType.equalsIgnoreCase("IDA_E_VOLTA")) this.transportationType = TransportationType.IDA_E_VOLTA;
        else if (transportationType.equalsIgnoreCase("IDA")) this.transportationType = TransportationType.IDA;
        else if (transportationType.equalsIgnoreCase("VOLTA")) this.transportationType = TransportationType.VOLTA;
        else throw new InvalidTransportationTypeException();
    }

    public Responsible getResponsible() {
        return responsible;
    }

    public void setResponsible(Responsible responsible) {
        if (responsible == null) throw new IllegalArgumentException("Responsible cannot be null");
        this.responsible = responsible;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        if (address == null) throw new IllegalArgumentException("Address cannot be null");
        this.address = address;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        if (conductor == null) throw new IllegalArgumentException("Conductor cannot be null");
        this.conductor = conductor;
    }

    public List<Payment> getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(List<Payment> paymentList) {
        this.paymentList = paymentList;
    }
}
