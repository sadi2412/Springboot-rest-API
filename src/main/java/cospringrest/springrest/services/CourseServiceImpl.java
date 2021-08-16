package cospringrest.springrest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import cospringrest.springrest.Dao.CourseDao;
import cospringrest.springrest.entities.Course;

@Service 
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	 private CourseDao courseDao;
	 
//	List<Course> list;
	
	public CourseServiceImpl() {
		
//		list = new ArrayList<>();
//		list.add(new Course(145,"java", "this course containes basics of java"));
//		list.add(new Course(125,"Springboot","basicsof spring boot"));
//		list.add(new Course(12457,"SQL","BAsics of SQL"));
//		
	}
	
	
//getcourse
	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
	}


//get by id
	@Override
	public Course getCourse(long courseId) {

//		Course c = null;
//		for(Course course:list)
//		{
//			if(course.getId()==courseId)
//			{
//				c=course;
//				break;
//			}
//		}
		
		return courseDao.getOne(courseId);
	}


// add course
	@Override
	public Course addCourse(Course course) {
//		list.add(course);
		courseDao.save(course);
		return course;
	}


  //update course
	@Override
	public Course updateCourse(Course course) {
//		list.forEach(e -> {
//			if(e.getId()==course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
 courseDao.save(course);
		return course;
	}
	
	//delete course
	@Override
public void deleteCourse(long parseLong) {
//		list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
Course entity=	courseDao.getOne(parseLong);
	courseDao.delete(entity);
	
	}


}


