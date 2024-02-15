package org.student;

public class Queries
{
    public static final  String select="select * from student";
    public  static final  String insert="insert into student values(?,?,?,?);";
    public static final  String update="update student set stud_name=? where stud_id=?";
    public static final  String delete="delete from student where stud_id=?";
}
