
public class StudentDetails {

	private int studentId;
	private String studentName,studentAddress,collegeName;
	
	
	
	public StudentDetails(int studentId, String studentName, String studentAddress, String collegeName) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.collegeName = collegeName;
	}


	public StudentDetails(int studentId, String studentName, String studentAddress) {
		this(studentId,studentName,studentAddress,"NIT");
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}


	public int getStudentId() {
		return studentId;
	}


	public String getStudentName() {
		return studentName;
	}


	public String getStudentAddress() {
		return studentAddress;
	}


	public String getCollegeName() {
		return collegeName;
	}



}
