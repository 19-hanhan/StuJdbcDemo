package test;

import java.sql.*;
import java.util.ArrayList;

import Dao.StudentDao;
import Entity.Student;

public class jdbc {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Student stu = new Student("201926702047", "吴文龙");

        StudentDao dao = new StudentDao();

//    	int result = dao.deleteStudent("201926702048");
    	int result = dao.insertStudent(stu);
//        int result = dao.updateStudent(stu);
//    	ArrayList<Student> stus = dao.findStudentById("201926702047");
        ArrayList<Student> stus = dao.findAllStudent();

    	if (result == 1) {
			System.out.println("添加成功！");
		} else {
			System.out.println("添加失败！");
		}

        for (Student item : stus) {

            System.out.println(item);

        }

    }
}






