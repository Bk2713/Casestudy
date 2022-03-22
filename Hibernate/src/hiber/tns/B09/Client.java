package hiber.tns.B09;

import hiber.tns.entity.Student;
import hiber.tns.service.StudentService;
import hiber.tns.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		StudentService service=new StudentServiceImpl();
		Student student=new Student();
		student.setUid(21000802);
		student.setName("Bala kumar");
		service.addStudent(student);
		

	}

}
