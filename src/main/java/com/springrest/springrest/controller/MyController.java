package com.springrest.springrest.controller;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class MyController {


    @Autowired
    private CourseService courseService;

    @GetMapping("/home")
    public String home() {
        return "Welcome to home";
    }

    // get the courses

    @GetMapping("/allfeedback")
    public List<Course> getCourses() {
        return this.courseService.getReviews();


    }
//    get single course
    @GetMapping("/feedback/{courseId}")

    public CourseInterface getCourse(@PathVariable String courseId){


//        try{

//            return this.courseService.getReviewbyId(Long.parseLong(courseId));
//        }catch (Exception e ){
//            return this.courseService.getReviews()[0];
//        }
          Course courseSel = this.courseService.getReviewbyId(Long.parseLong(courseId));
          CourseInterface resCourse = {"id" : courseSel.getId(), "firstname" : courseSel.getFirstname(), "lastname" : courseSel.getLastname(), "service" : courseSel.getFirstname(), "review" : courseSel.getReview()}
          return resCourse;

}


    //add course
    @PostMapping("/feedback")
    public Course addCourse(@RequestBody Course feedback){
//        return feedback;
        return this.courseService.postReview(feedback);
    }

    @PutMapping("/feedback/update")
    public Course updateReview(@RequestBody  Course course){
        return this.courseService.updateReview(course);
    }



    @DeleteMapping("/feedback/{courseId}")
    public ResponseEntity<HttpStatus> deleteReview(@PathVariable String courseId){
        try{
            this.courseService.deleteReview(Long.parseLong(courseId));
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e ){
            return  new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }



}
