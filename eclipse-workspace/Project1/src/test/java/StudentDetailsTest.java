import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentDetailsTest {
	StudentDetails student1;

	@BeforeEach
	void setUp() throws Exception {
		student1=new StudentDetails(1001,"Akash","Delhi");
	}

	@Test
	void testGetStudentId() {
		assertEquals(student1.getStudentId(),1001);
	}

	@Test
	void testGetStudentName() {
		assertEquals(student1.getStudentName(),"Akash");
	}

	@Test
	void testGetStudentAddress() {
		assertEquals(student1.getStudentAddress(),"Delhi");
	}

	@Test
	void testGetCollegeName() {
		assertEquals(student1.getCollegeName(),"NIT");
	}

}
