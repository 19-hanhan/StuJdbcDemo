package Dao;

import java.util.ArrayList;

import Entity.Student;
import Util.JDBCUtil;
import Util.StudentResultSetProcessor;

public class StudentDao {

    // 功能函数
    public int insertStudent(Student stu) { // 插入学生

        String sql = "insert into Student(id, name) value(?,?)";
        int numOfColumn = JDBCUtil.update(sql, stu.getId(), stu.getName());

        return numOfColumn;

    }

    public int updateStudent(Student stu) { // 更新学生信息

        String sql = "update Student set name = ? where id = ?";
        int numOfColumn = JDBCUtil.update(sql, stu.getName(), stu.getId());

        return numOfColumn;

    }

    public int deleteStudent(String id) { // 删除学生信息

        String sql = "delete from Student where id = ?";
        int numOfColumn = JDBCUtil.update(sql, id);

        return numOfColumn;

    }

    public ArrayList<Student> findStudentById(String id) { // 用ID找学生

        String sql = "select * from Student where id = ?";

        ArrayList<Student> stuList = JDBCUtil.query(sql, new StudentResultSetProcessor(), id);

        return stuList;

    }

    public ArrayList<Student> findAllStudent() { // 查询所有学生

        String sql = "select * from student";

        ArrayList<Student> stuList = JDBCUtil.query(sql, new StudentResultSetProcessor());

        return stuList;

    }

}
