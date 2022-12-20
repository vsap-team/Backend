package com.excel.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.excel.entity.*;
import com.excel.helper.*;
import com.excel.repo.*;

import com.excel.repo.StudentRepo;


@Service
public class StudentService {
	
	@Autowired
	private StudentRepo studentrepo;
	
	public void save(MultipartFile file)
	{
		try {
			List<Students> students = Helper.convertExcelToListOfStudents(file.getInputStream());
			this.studentrepo.saveAll(students);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<Students> getAllStudents()
	{
		return this.studentrepo.findAll();
	}

	
}
