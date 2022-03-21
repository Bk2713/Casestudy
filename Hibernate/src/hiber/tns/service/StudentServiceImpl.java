package hiber.tns.service;

import hiber.tns.dao.StudentDao;
import hiber.tns.entity.Student;

public class StudentServiceImpl implements StudentService  {
	StudentDao sd;
	StudentServiceImpl()
	{
		sd=new StudentDao() {
		}
	@Override
	public void addStudent(Student student) {
		sd.add
		}

}
