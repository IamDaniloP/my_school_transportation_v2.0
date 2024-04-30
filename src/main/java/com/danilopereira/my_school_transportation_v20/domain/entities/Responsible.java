package com.danilopereira.my_school_transportation_v20.domain.entities;

import java.util.UUID;

public class Responsible {
    private UUID id;
    private String name;
    private String email;
    private String phone;

    private Student student;

    public Responsible(UUID id, String name, String email, String phone, Student student) {
        setId(id);
        setName(name);
        setEmail(email);
        setPhone(phone);
        setStudent(student);
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.isEmpty()) throw new IllegalArgumentException("Email cannot be empty");
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (phone.isEmpty()) throw new IllegalArgumentException("Phone cannot be empty");
        this.phone = phone;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        if (student == null) throw new IllegalArgumentException("Student cannot be null");
        this.student = student;
    }
}
