package com.springboottut.springboot.service;

import com.springboottut.springboot.domain.Course;
import com.springboottut.springboot.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllofCourse(String topicId){
        List<Course> courses = new ArrayList<>();
        courseRepository.findByTopicId(topicId).forEach(courses::add);
        return courses;
    }

    public Optional<Course> getCoursebyId(String id){
        return courseRepository.findById(id);
    }

    public Course updateCoursebyService(Course course){
        return courseRepository.save(course);
    }

    public void deleteCoursebyId(String id){
        courseRepository.deleteById(id);
    }

    public void addCourseByService(Course course){
        courseRepository.save(course);
    }
}
