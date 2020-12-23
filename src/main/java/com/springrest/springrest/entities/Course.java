package com.springrest.springrest.entities;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {

    @Id
    private long id;
    private String firstName;
    private String lastName;
    private String service;
    private String review;

    public Course(long id, String firstName, String lastName, String service, String review) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.service = service;
        this.review = review;
    }

    public Course(){
        super();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    @Override
    public String toString() {
        return "course [ id=" + id +",firstName" + firstName +", lastName" + lastName + ",title=" + service + ", description" + review+ "]";
    }
}
