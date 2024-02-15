package org.student;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class StudentDB
{
    public static void addStudent(Student student) throws Exception
    {
        Connection connection=DB.con();
        PreparedStatement preparedStatement=connection.prepareStatement(Queries.insert);
        preparedStatement.setInt(1,student.getStud_rollNo());
        preparedStatement.setString(2,student.getStud_name());
        preparedStatement.setString(3,student.getStud_address());
        preparedStatement.setString(4,student.getStud_phoneNo());
        preparedStatement.execute();
        connection.close();
        preparedStatement.close();
    }
    public  static  void updateStudent(int id,String name) throws Exception
    {
        Connection connection= DB.con();
        PreparedStatement preparedStatement=connection.prepareStatement(Queries.update);
        preparedStatement.setString(1,name);
        preparedStatement.setInt(2,id);
        preparedStatement.executeUpdate();
        connection.close();
        preparedStatement.close();
    }
    public static  void deleteStudent(int id) throws Exception
    {
        Connection connection=DB.con();
         PreparedStatement preparedStatement=connection.prepareStatement(Queries.delete);
         preparedStatement.setInt(1,id);
         preparedStatement.executeUpdate();
         connection.close();
         preparedStatement.close();
    }
    public  static  void displayStudent() throws Exception
    {
        ArrayList<Student> students=new ArrayList<>();
        Connection connection=DB.con();
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery(Queries.select);
        while (resultSet.next())
        {
            Student student=new Student(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4));
            students.add(student);
        }
        for (Student stud:students)
        {
            System.out.println(stud+"\n");
        }
        connection.close();
        statement.close();
        resultSet.close();

    }

}
