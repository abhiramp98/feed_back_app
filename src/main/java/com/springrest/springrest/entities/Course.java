package com.springrest.springrest.entities;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Table(name = "course")
public class Course {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,length = 20)
    private long id;

    @Column(nullable = false,length = 20)
    private String firstname;

    @Column(nullable = false,length = 20)
    private String lastname;

    @Column(nullable = false,length = 10)
    private String service;

    @Column(nullable = false,length = 45)
    private String review;

    public Course(long id, String firstname, String lastname, String service, String review) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
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

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
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
        return "course [ id=" + id +",firstName" + firstname +", lastName" + lastname + ",title=" + service + ", description" + review+ "]";
    }
}
