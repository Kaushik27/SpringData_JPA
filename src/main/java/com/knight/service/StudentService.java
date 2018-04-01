package com.knight.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.knight.domain.Student;
import com.knight.repo.StudentRepo;

@Service
public class StudentService {

	@Autowired
	StudentRepo studentRepo;

	public Student addStudent() {
		System.out.println("in service");
		Student st = new Student();
		st.setSname("bony");
		st.setSemail("bony@gmail.com");
		System.out.println(studentRepo.findAll());
		System.out.println(studentRepo.findOne(111L));
		System.out.println(studentRepo.getOne(5L));
		System.out.println(studentRepo.count());
		studentRepo.delete(st);
		return studentRepo.save(st);
	}
}
