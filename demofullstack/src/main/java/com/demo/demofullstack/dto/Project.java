package com.demo.demofullstack.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank(message = "project name is required")
    @NotEmpty( message = "project name cannot be empty")
    private String  projectName;

    @NotBlank( message = "project identifier is required")
    @Size(min = 4,max = 5,message = "project identifier size has to be between 4 to 5")
    @Column(updatable = false,unique = true)
    private String projectIdentifier;

    @NotBlank( message = "description cannot be blank")
    @NotEmpty( message = "description cannot be empty")
    private String description;

    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date startDate;

    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date endDate;

    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date createdAt;

    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date updatedAt;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectIdentifier() {
        return projectIdentifier;
    }

    public void setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Project(){

    }

    @PrePersist
    protected void onCreation(){
        this.createdAt = new Date();
    }

    @PreUpdate
    protected void onUpdation(){
        this.updatedAt = new Date();
    }

}
