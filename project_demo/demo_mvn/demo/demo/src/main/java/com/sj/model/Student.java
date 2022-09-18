package com.sj.model;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Student {
	@Id
	private int StudentId;
	private String studentName;
	private String studentMail;
	private long studentContact;
	public int getStudentId() {
		return StudentId;
	}
	@OneToOne(cascade=CascadeType.ALL)
	Application application;
	@ManyToOne
	Course course;
	@OneToOne(cascade=CascadeType.ALL)
	Payment payment;
	
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getstudentName() {
		return studentName;
	}
	public void setstudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getstudentMail() {
		return studentMail;
	}
	public void setstudentMail(String studentMail) {
		this.studentMail = studentMail;
	}
	public long getstudentContact() {
		return studentContact;
	}
	public void setstudentContact(long studentContact) {
		this.studentContact = studentContact;
	}
	public Application getApplication() {
		return application;
	}
	public void setApplication(Application application) {
		this.application = application;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", studentName=" + studentName + ", studentMail=" + studentMail
				+ ", studentContact=" + studentContact + ", application=" + application + ", course=" + course
				+ ", payment=" + payment + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(studentContact, StudentId, studentMail, studentName, application, course, payment);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return studentContact == other.studentContact && StudentId == other.StudentId
				&& Objects.equals(studentMail, other.studentMail) && Objects.equals(studentName, other.studentName)
				&& Objects.equals(application, other.application) && Objects.equals(course, other.course)
				&& Objects.equals(payment, other.payment);
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentId, String studentName, String studentMail, long studentContact, Application application,
			Course course, Payment payment) {
		super();
		StudentId = studentId;
		this.studentName = studentName;
		this.studentMail = studentMail;
		this.studentContact = studentContact;
		this.application = application;
		this.course = course;
		this.payment = payment;
	}
	
	
	
}
