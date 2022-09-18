package com.sj.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sj.model.Application;
import com.sj.model.Course;
import com.sj.model.Payment;
import com.sj.model.Student;
import com.sj.service.StudentService;

@RestController
@RequestMapping("/admin")
public class StudentController {
@Autowired
StudentService studentService;
//view all records
@GetMapping("/user/viewall")
public List<Student> StudentviewAll(){
	return studentService.studentviewAll();
}
//createStudent
@PostMapping("/user/create")
public Student createStudent(@RequestBody Student student) {
	return studentService.createStudent(student);
}
//getStudent
@GetMapping("/user/get/{id}")
public Student studentGetById(@PathVariable int id) {
	return studentService.studentGetById(id);
}
//update-application
@PutMapping("/application/update/{id}")
public Application updateApplication(@PathVariable int id,@RequestBody Application toUpdate) {
	return studentService.updateApplication(id,toUpdate);
}
//Get-Application-by-id
@GetMapping("/application/get/{id}")
public Application getByApplicationId(@PathVariable int id) {
	return studentService.getByApplicationId(id);
}
//create-course
@PostMapping("/course/create")
public Course createCourse(@RequestBody Course course) {
	return studentService.createCourse(course);
}
//get-course
@GetMapping("/get/course/{id}")
public Course courseGetById(@PathVariable int id) {
	return studentService.courseGetById(id);
	
 
}
//updating course by id
@PutMapping("/course/update/{id}")
public Course courseUpdateById(@PathVariable int id, @RequestBody Course toUpdate) {
	return studentService.courseUpdateById(id,toUpdate);
	
}
//getting payment record by id
@GetMapping("/get/Payment/{id}")
public Payment paymentGetById(@PathVariable int id) {
	return studentService.paymentGetById(id);
}

//getting application  by using status
  @GetMapping("/get/ApllicationStatus/{Status}") public
  List<Application> getByApplicationStatus (@PathVariable String Status)
  { return studentService.getByApplicationStatus(Status); }
 
 //updating student by id
@PutMapping("/student/update/{id}")
public  Student updateStudent(@PathVariable int id,@RequestBody  Student toUpdate) {
	return studentService.updateStudent(id,toUpdate);
}
//getting record using student name
@GetMapping("/student/findbyName/{StudentName}")
public List<Student> getByStudentName(@PathVariable  String StudentName){
	return studentService.getByStudentName(StudentName);
}
//getting record using mail
@GetMapping("/student/findbyMail/{StudentMail}")
public List<Student> getByStudentMail(@PathVariable  String StudentMail){
	return studentService.getByStudentMail(StudentMail);
}
//getting record using by contact
@GetMapping("/student/findbyContact/{StudentContact}")
public List<Student> getByStudentContact(@PathVariable  long StudentContact){
	return studentService.getByStudentContact(StudentContact);
}
//view all applications
@GetMapping("/user/allapplications")
public List<Application> applicationviewAll(){
	return studentService.applicationviewAll();
}

}
