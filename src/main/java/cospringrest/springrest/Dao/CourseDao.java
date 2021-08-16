package cospringrest.springrest.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cospringrest.springrest.entities.Course;

public interface  CourseDao extends JpaRepository<Course ,Long> {

}
