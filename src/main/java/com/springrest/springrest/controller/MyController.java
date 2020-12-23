package com.springrest.springrest.controller;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {


    @Autowired
    private CourseService courseService;

    @GetMapping("/home")
    public String home(){
        return "Welcome to home";
    }

    // get the courses

    @GetMapping("/allfeedback")
    public List<Course> getCourses(){
        return this.courseService.getReviews();




    }
        //get single course
    @GetMapping("/feedback/{serviceId}")

    public Course getCourse(@PathVariable String serviceId){
        return this.courseService.getReviewbyid(Long.parseLong(serviceId));

    }
    //add course
    @PostMapping("/feedback")
    public Course addCourse(@RequestBody Course feedback){
//        return feedback;
        return this.courseService.postReview(feedback);
    }



}
