package com.sarthak_nande.crud_opration;

import com.sarthak_nande.crud_opration.dao.StudentDao;
import com.sarthak_nande.crud_opration.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class CrudOprationApplication {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		SpringApplication.run(CrudOprationApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDao studentDao) {
		return runner -> {
//			createNewStudent(studentDao);
//			readStudentById(studentDao);
//			findAllStudenst(studentDao);
//			updateStudent(studentDao);
			delteStudent(studentDao);
		};
	}

	private void delteStudent(StudentDao studentDao) {
		System.out.println("Enter Your Student ID: ");
		int id = sc.nextInt();
		System.out.println("Deleting Student Record...");
		studentDao.delete(id);
		System.out.println("Deleted Successfuly....");
	}

	private void updateStudent(StudentDao studentDao) {
		System.out.println("Enter the id of student: ");
		int id = sc.nextInt();

		Student gotStudent = studentDao.findById(id);

		System.out.println(gotStudent);
		System.out.println("Updating student....");

		gotStudent.setLast_Name("Nande");
		studentDao.update(gotStudent);

		System.out.println("Updated Student: " + gotStudent);

	}

//	private void findAllStudenst(StudentDao studentDao) {
//		List<Student> allStudents = studentDao.findAll();
//
//		for(Student student : allStudents) {
//			System.out.println(student);
//		}
//	}

//	private void readStudentById(StudentDao studentDao) {
//		Student myStudent = studentDao.findById(1);
//
//		System.out.println("Student Data: "+ myStudent);
//	}

//	private void createNewStudent(StudentDao studentDao) {
//		System.out.println("Creating New Student Object....");
//		Student tempStud = new Student("Madhav","Kamble");
//
//		System.out.println("Saving Student.....");
//		studentDao.save(tempStud);
//
//		System.out.println("Student ID is: " + tempStud.getId());
//
//		int getID = tempStud.getId();
//
//		Student myStudent = studentDao.findById(getID);
//
//
//		System.out.println("Student Data: "+ myStudent);
//
//	}

}
