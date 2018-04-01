package com.knight.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.knight.domain.Student;
import com.knight.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@GetMapping("/addStudent")
	public @ResponseBody Student addStudent(){
		System.out.println("in controller");
		return studentService.addStudent();
	}
	
}
