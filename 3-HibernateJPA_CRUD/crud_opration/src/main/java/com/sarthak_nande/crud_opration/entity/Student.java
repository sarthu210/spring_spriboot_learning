package com.sarthak_nande.crud_opration.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student_info")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "First_Name")
    private String First_Name;

    @Column(name = "Last_Name")
    private String Last_Name;

    public Student(String first_Name, String last_Name) {
        First_Name = first_Name;
        Last_Name = last_Name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String first_Name) {
        First_Name = first_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String last_Name) {
        Last_Name = last_Name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", First_Name='" + First_Name + '\'' +
                ", Last_Name='" + Last_Name + '\'' +
                '}';
    }
}
