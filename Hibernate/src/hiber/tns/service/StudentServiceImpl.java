package hiber.tns.service;

import hiber.tns.dao.StudentDaoImpl;
import hiber.tns.entity.Student;

public class StudentServiceImpl implements StudentService  {
	StudentDao sd;
	public StudentServiceImpl()
	{
		sd=new StudentDaoImpl() {
		}
	@Override
	public void addStudent(Student student) {
		sd.addStudent(student);
		}

}
