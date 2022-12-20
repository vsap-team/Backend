package com.excel.helper;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import com.excel.entity.Students;


public class Helper {
	//check file content as excel or not
		public static boolean checkExcelFormat(MultipartFile file) {
			
			String contentType = file.getContentType();
			
			if(contentType.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"))
			{
				return true;
			}else
			{
				return false;
			}
		}
		
		//convert excel to lists of Students
		public static List<Students> convertExcelToListOfStudents(InputStream is)
		{
			List<Students> List = new ArrayList<>();
			
			try
			{
				
				XSSFWorkbook workbook = new XSSFWorkbook(is);
				
				XSSFSheet sheet = workbook.getSheet("Data");
				
				int rowNumber=0;
				Iterator<Row> iterator =  sheet.iterator();
				
				while(iterator.hasNext())
				{
					 Row row = iterator.next();
					 
					 if(rowNumber==0)
					 {
						 rowNumber++;
						 continue;
					 }
					 Iterator<Cell> cells = row.iterator();
					 
					 int cid=0;
					 
					 Students s = new Students();
					 while(cells.hasNext())
					 {
						 Cell cell = cells.next();
						 
						 switch (cid)
						 {
						 	case 0:
						 		s.setStudentId((int)cell.getNumericCellValue());
						 		break;
						 	case 1:
						 		s.setFirstName(cell.getStringCellValue());
						 		break;
						 	case 2:
						 		s.setLastName(cell.getStringCellValue());
						 		break;
						 	case 3:
						 		s.setDateOfBirth(cell.getStringCellValue());
						 		break;
						 	case 4:
						 		s.setContactPhone((int)cell.getNumericCellValue());
						 		break;
						 	case 5:
						 		s.setTwitterHandle(cell.getStringCellValue());
						 		break;
						 	case 6:
						 		s.setFacebookHandle(cell.getStringCellValue());
						 		break;
						 	case 7:
						 		s.setPersonalEmail(cell.getStringCellValue());
						 		break;
						 	case 8:
						 		s.setVirtusaEmail(cell.getStringCellValue());
						 		break;
						 	case 9:
						 		s.setDateOfSelection(cell.getStringCellValue());
						 		break;
						 	case 10:
						 		s.setAddress1(cell.getStringCellValue());
						 		break;
						 	case 11:
						 		s.setAddress2(cell.getStringCellValue());
						 		break;
						 	case 12:
						 		s.setAddress3(cell.getStringCellValue());
						 		break;
						 	case 13:
						 		s.setState(cell.getStringCellValue());
						 		break;
						 	case 14:
						 		s.setCity(cell.getStringCellValue());
						 		break;
						 	case 15:
						 		s.setPinCode((int)cell.getNumericCellValue());
						 		break;
						 	case 16:
						 		s.setCollegeId((int)cell.getNumericCellValue());
						 		break;
						 	case 17:
						 		s.setCollegeName(cell.getStringCellValue());
						 		break;
						 	case 18:
						 		s.setIsAutonomous(cell.getStringCellValue());
						 		break;
						 	case 19:
						 		s.setIsUniversityStatus(cell.getStringCellValue());
						 		break;
						 	case 20:
						 		s.setDepartment(cell.getStringCellValue());
						 		break;
						 	case 21:
						 		s.setCurrentSemester((int)cell.getNumericCellValue());
						 		break;
						 	case 22:
						 		s.setCurrentYear((int)cell.getNumericCellValue());
						 		break;
						 	case 23:
						 		s.setModeOfSelection(cell.getStringCellValue());
						 		break;
						 	default:
						 		break;
						 }
						 cid++;
					 }
					 List.add(s);
				}
				
			}catch (Exception e) {
				e.printStackTrace();
			}
			return List;
		}
}
