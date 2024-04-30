package com.danilopereira.my_school_transportation_v20.domain.entities;

import java.util.List;
import java.util.UUID;

public class Conductor {
    private UUID id;
    private String name;
    private String email;
    private String cpf;
    private String password;

    private List<Student> studentList;

    public Conductor(UUID id, String name, String email, String cpf, String password, List<Student> studentList) {
        setId(id);
        setName(name);
        setEmail(email);
        setCpf(cpf);
        setPassword(password);
        setStudentList(studentList);
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf.isEmpty()) throw new IllegalArgumentException("Cpf cannot be empty");
        this.cpf = cpf;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.isEmpty()) throw new IllegalArgumentException("Password cannot be empty");
        this.password = password;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
