package org.student;

public class Student
{
    private String stud_name;
    private int stud_rollNo;
    private String stud_address;
    private String stud_phoneNo;

    public Student( int stud_rollNo,String stud_name, String stud_address, String stud_phoneNo) {

        this.stud_name = stud_name;
        this.stud_rollNo = stud_rollNo;
        this.stud_address = stud_address;
        this.stud_phoneNo = stud_phoneNo;
    }

    public String getStud_name() {
        return stud_name;
    }

    public int getStud_rollNo() {
        return stud_rollNo;
    }

    public String getStud_address() {
        return stud_address;
    }

    public String getStud_phoneNo() {
        return stud_phoneNo;
    }

    @Override
    public String toString() {
        return "{" +
                "Student Name='" + stud_name + '\'' +
                ",Student RollNo=" + stud_rollNo +
                ", Student address='" + stud_address + '\'' +
                ", Student PhoneNo=" + stud_phoneNo +
                '}';
    }
}