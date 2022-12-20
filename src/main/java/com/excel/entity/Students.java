package com.excel.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Students {

	@Id
	private Integer studentId;
	
	private String firstName;
	
	private String lastName;
	
	private String dateOfBirth;
	
	private Integer contactPhone;
	
	private String twitterHandle;
	
	private String facebookHandle;
	
	private String personalEmail;
	
	private String virtusaEmail;
	
	private String dateOfSelection;
	
	private String address1;
	
	private String address2;
	
	private String address3;
	
	private String state;
	
	private String city;
	
	private Integer pinCode;
	
	private Integer collegeId;
	
	private String collegeName;
	
	private String isAutonomous;
	
	private String isUniversityStatus;
	
	private String department;
	
	private Integer currentSemester;
	
	private Integer currentYear;
	
	private String modeOfSelection;
	
//.....................................................................................................................................
	public Students(Integer studentId, String firstName, String lastName, String dateOfBirth, Integer contactPhone,
			String twitterHandle, String facebookHandle, String personalEmail, String virtusaEmail,
			String dateOfSelection, String address1, String address2, String address3, String state, String city,
			Integer pinCode, Integer collegeId, String collegeName, String isAutonomous, String isUniversityStatus,
			String department, Integer currentSemester, Integer currentYear, String modeOfSelection) {
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.contactPhone = contactPhone;
		this.twitterHandle = twitterHandle;
		this.facebookHandle = facebookHandle;
		this.personalEmail = personalEmail;
		this.virtusaEmail = virtusaEmail;
		this.dateOfSelection = dateOfSelection;
		this.address1 = address1;
		this.address2 = address2;
		this.address3 = address3;
		this.state = state;
		this.city = city;
		this.pinCode = pinCode;
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.isAutonomous = isAutonomous;
		this.isUniversityStatus = isUniversityStatus;
		this.department = department;
		this.currentSemester = currentSemester;
		this.currentYear = currentYear;
		this.modeOfSelection = modeOfSelection;
	}
//........................................................................................................................................
	public Students() {
		
		}
	//...................................................................
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Integer getContactPhone() {
		return contactPhone;
	}
	public void setContactPhone(Integer contactPhone) {
		this.contactPhone = contactPhone;
	}
	public String getTwitterHandle() {
		return twitterHandle;
	}
	public void setTwitterHandle(String twitterHandle) {
		this.twitterHandle = twitterHandle;
	}
	public String getFacebookHandle() {
		return facebookHandle;
	}
	public void setFacebookHandle(String facebookHandle) {
		this.facebookHandle = facebookHandle;
	}
	public String getPersonalEmail() {
		return personalEmail;
	}
	public void setPersonalEmail(String personalEmail) {
		this.personalEmail = personalEmail;
	}
	public String getVirtusaEmail() {
		return virtusaEmail;
	}
	public void setVirtusaEmail(String virtusaEmail) {
		this.virtusaEmail = virtusaEmail;
	}
	public String getDateOfSelection() {
		return dateOfSelection;
	}
	public void setDateOfSelection(String dateOfSelection) {
		this.dateOfSelection = dateOfSelection;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getAddress3() {
		return address3;
	}
	public void setAddress3(String address3) {
		this.address3 = address3;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getPinCode() {
		return pinCode;
	}
	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}
	public Integer getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(Integer collegeId) {
		this.collegeId = collegeId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getIsAutonomous() {
		return isAutonomous;
	}
	public void setIsAutonomous(String isAutonomous) {
		this.isAutonomous = isAutonomous;
	}
	public String getIsUniversityStatus() {
		return isUniversityStatus;
	}
	public void setIsUniversityStatus(String isUniversityStatus) {
		this.isUniversityStatus = isUniversityStatus;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Integer getCurrentSemester() {
		return currentSemester;
	}
	public void setCurrentSemester(Integer currentSemester) {
		this.currentSemester = currentSemester;
	}
	public Integer getCurrentYear() {
		return currentYear;
	}
	public void setCurrentYear(Integer currentYear) {
		this.currentYear = currentYear;
	}
	public String getModeOfSelection() {
		return modeOfSelection;
	}
	public void setModeOfSelection(String modeOfSelection) {
		this.modeOfSelection = modeOfSelection;
	}

}
