package com.springrest.springrest.services;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    private CourseDao courseDao;

//    List<Course> list;

    public CourseServiceImpl(){
//        list = new ArrayList<>();
//        list.add(new Course(145,"Java core course","this course contains basics of java"));
//        list.add(new Course(4343,"spring boot course","Creating rest api using spring boot"));


    }


    @Override
    public List<Course> getReviews() {
        return courseDao.findAll();
//        return list;
    }

    @Override
    public Course getReviewbyid(Long courseId) {
//        Course c =null;
//        for(Course course:list)
//        {
//            if(course.getId()==courseId){
//                c = course;
//                break;
//            }
//        }
        return courseDao.getOne(courseId);
//        return c;
    }

    @Override
    public Course postReview(Course course) {
//        list.add(course);
        courseDao.save(course);
        return course;
    }

}
