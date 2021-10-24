
package com.tcs.bean;
/**
 * @author SUSHMITHA SHETTY
 *
 */
public class Student{
	private int studentId;
	private String studentDept;
	private String studentName;
	private String studentEmail;
	private String studentMobile;
	private String studentGender;
	private String studentPassword;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, String studentDept, String studentName, String studentEmail, String studentMobile,
			String studentGender, String studentPassword) {
		super();
		this.studentId = studentId;
		this.studentDept = studentDept;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.studentMobile = studentMobile;
		this.studentGender = studentGender;
		this.studentPassword = studentPassword;
	}

	/**
	 * @return the studentId
	 */
	public int getStudentId() {
		return studentId;
	}

	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	/**
	 * @return the studentDept
	 */
	public String getStudentDept() {
		return studentDept;
	}

	/**
	 * @param studentDept the studentDept to set
	 */
	public void setStudentDept(String studentDept) {
		this.studentDept = studentDept;
	}

	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}

	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	/**
	 * @return the studentEmail
	 */
	public String getStudentEmail() {
		return studentEmail;
	}

	/**
	 * @param studentEmail the studentEmail to set
	 */
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	/**
	 * @return the studentMobile
	 */
	public String getStudentMobile() {
		return studentMobile;
	}

	/**
	 * @param studentMobile the studentMobile to set
	 */
	public void setStudentMobile(String studentMobile) {
		this.studentMobile = studentMobile;
	}

	/**
	 * @return the studentGender
	 */
	public String getStudentGender() {
		return studentGender;
	}

	/**
	 * @param studentGender the studentGender to set
	 */
	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}

	/**
	 * @return the studentPassword
	 */
	public String getStudentPassword() {
		return studentPassword;
	}

	/**
	 * @param studentPasword the studentPassword to set
	 */
	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}
}
