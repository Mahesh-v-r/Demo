package com.sj.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sj.model.Student;


@Repository
public interface StudentRepo extends JpaRepository<Student,Integer>{

	 public List< Student> findByStudentName(String  StudentName);
	 public List< Student> findByStudentMail(String   StudentMail);
	 public List< Student> findByStudentContact(long   StudentContact);
	 
	 
}
