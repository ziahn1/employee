package com.employee.employeemanagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name="full_name")
    private String fullName;
    @Column(name="mobile_number",unique = true)
    private String mobileNumber;
    @Column(name="primary_email")
    private String primaryEmail;
  
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public String getPrimaryEmail() {
        return primaryEmail;
    }
    public void setPrimaryEmail(String primaryEmail) {
        this.primaryEmail = primaryEmail;
    }
    public EmployeeEntity() {
    }
    public EmployeeEntity(Long id, String fullName, String mobileNumber, String primaryEmail) {
        this.id = id;
        this.fullName = fullName;
        this.mobileNumber = mobileNumber;
        this.primaryEmail = primaryEmail;
    }

    

    

}
