package com.mycompany;

import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "Employe")
public class Student_1 {

    @Id
    @Column(name = "emp_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer emp_id;

    @Column(name = "emp_Name")
    private String emp_name;

    @Column(name = "emp_Salary")
    private Integer emp_salary;

    @Lob
    @Column(name = "emp_image", columnDefinition = "LONGBLOB")
    private byte[] emp_image;

    @Temporal(TemporalType.DATE)
    @Column(name = "date")
    private Date date;

    // Getters and Setters
    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public Integer getEmp_salary() {
        return emp_salary;
    }

    public void setEmp_salary(Integer emp_salary) {
        this.emp_salary = emp_salary;
    }

    public byte[] getEmp_image() {
        return emp_image;
    }

    public void setEmp_image(byte[] emp_image) {
        this.emp_image = emp_image;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
