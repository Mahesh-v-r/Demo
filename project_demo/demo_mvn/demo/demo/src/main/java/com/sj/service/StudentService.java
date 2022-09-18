package com.sj.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sj.model.Application;
import com.sj.model.Course;
import com.sj.model.Payment;
import com.sj.model.Student;
import com.sj.repository.ApplicationRepo;
import com.sj.repository.CourseRepo;
import com.sj.repository.PaymentRepo;
import com.sj.repository.StudentRepo;

@Service
public class StudentService {

@Autowired	
StudentRepo studentRepo;
@Autowired
ApplicationRepo applicationRepo;
@Autowired
CourseRepo courseRepo;
@Autowired
PaymentRepo paymentRepo;

	public List<Student> studentviewAll() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
	}

	public Student createStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}

	public Student studentGetById(int id) {
		// TODO Auto-generated method stub
		return studentRepo.findById(id).get();
	}

	

	public Application updateApplication(int id, Application toUpdate) {
		// TODO Auto-generated method stub
		Application app = getByApplicationId(id);
		app.setApplicationStatus(toUpdate.getApplicationStatus());
		return applicationRepo.save(app);
		
	}

	public Application getByApplicationId(int id) {
		// TODO Auto-generated method stub
		return applicationRepo.findById(id).get();
	}

	public Course createCourse(Course course) {
		// TODO Auto-generated method stub
		return courseRepo.save(course);
	}

	public Course courseGetById(int id) {
		// TODO Auto-generated method stub
		return courseRepo.findById(id).get();
	}

	 
	public Course courseUpdateById(int id, Course toUpdate) {
		// TODO Auto-generated method stub
		Course course = courseGetById(id);
		course.setCourseName(toUpdate.getCourseName());
				
		return  courseRepo.save(course);
	}

	public Payment paymentGetById(int id) {
		// TODO Auto-generated method stub
		return paymentRepo.findById(id).get();
	}
	
	
	  public List<Application> getByApplicationStatus(String Status) {
	  // TODO Auto-generated method stub
	  
	  return applicationRepo.findByStatus(Status); }
	 
	 

	public Student updateStudent(int id, Student toUpdate) {
		// TODO Auto-generated method stub
		Student student = studentGetById(id);
		student.setstudentName(toUpdate.getstudentName());
		student.setstudentMail(toUpdate.getstudentMail());
		student.setstudentContact(toUpdate.getstudentContact());
		return  studentRepo.save(student);
	}

	public List<Student> getByStudentName(String studentName) {
		// TODO Auto-generated method stub
		return studentRepo.findByStudentName(studentName);
	}

	public List<Student> getByStudentMail(String studentMail) {
		// TODO Auto-generated method stub
		return  studentRepo.findByStudentMail(studentMail);
	}

	public List<Student> getByStudentContact(long studentContact) {
		// TODO Auto-generated method stub
		return  studentRepo.findByStudentContact(studentContact);
	}

	public List<Application> applicationviewAll() {
		// TODO Auto-generated method stub
		 return applicationRepo.findAll();
		
	}

	

}
