package com.haiphamcoder.cacheaside.demo.model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Date dob;
    @Column(name = "class_id")
    private Long classId;
    private String phone;

    public Student() {
    }

    public Student(Long id, String name, Date dob, Long classId, String phone) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.classId = classId;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student {" + "\n\t" +
                "id=" + id + ",\n\t" +
                "name=" + name + ",\n\t" +
                "dob=" + dob + ",\n\t" +
                "classId=" + classId + ",\n\t" +
                "phone=" + phone + "\n" +
                "}";
    }
}
