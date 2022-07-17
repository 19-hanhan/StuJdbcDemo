package Util;

import java.sql.ResultSet;
import java.util.ArrayList;

import Entity.Student;

public class StudentResultSetProcessor implements ResultSetHandler<ArrayList<Student>>{

    @Override
    public ArrayList<Student> getData(ResultSet resSet) {

        ArrayList<Student> stuList = new ArrayList<Student>();

        try {

            while (resSet.next()) { // 将结果集信息录入stu对象

                Student stu = new Student();
                stu.setId(resSet.getString("id"));
                stu.setName(resSet.getString("name"));

                stuList.add(stu);

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

        return stuList;

    }

}
