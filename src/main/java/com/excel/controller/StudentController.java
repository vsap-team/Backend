package com.excel.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.excel.repo.StudentRepo;
import com.excel.service.StudentService;
import com.excel.entity.Students;
import com.excel.helper.*;


@RestController
@CrossOrigin("*")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/students/upload")
	public ResponseEntity<?> upload(@RequestParam("file")MultipartFile file)
	{
		if(Helper.checkExcelFormat(file))
		{
			//true
			
			this.studentService.save(file);
			
			return ResponseEntity.ok(Map.of("message","File is uploaded and data is saved to the database successfully"));
			
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Please upload only Excel files");
	}
	
	@GetMapping("/students")
	public List<Students> getAllProduct()
	{
		return this.studentService.getAllStudents();
	}
	
}
