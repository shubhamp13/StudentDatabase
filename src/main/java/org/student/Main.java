package org.student;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        while (true)
        {
            Student student=null;
            int rollNo=0;
            String address=null;
            String phoneNo=null;
            System.out.println("Enter Your Choice:");
            System.out.println("1.Insert Student");
            System.out.println("2.Update Student");
            System.out.println("3.Delete Student");
            System.out.println("4.Display Student");
            int choice=Integer.parseInt(bufferedReader.readLine());
            switch (choice)
            {
                case 1:
                    System.out.println("Enter Student name:");
                    String name=bufferedReader.readLine();
                    System.out.println("Enter Student Roll No");
                    rollNo=Integer.parseInt(bufferedReader.readLine());
                    System.out.println("Enter Student Address:");
                     address=bufferedReader.readLine();
                    System.out.println("Enter Student Phone No");
                     phoneNo=bufferedReader.readLine();
                     student=new Student(rollNo,name,address,phoneNo);
                    StudentDB.addStudent(student);
                    System.out.println("Record Inserted Successfully");
                    break;
                case  2:
                    System.out.println("Enter Roll Number Which To update");
                     rollNo=Integer.parseInt(bufferedReader.readLine());
                    System.out.println("Enter The New Name which You Want Update");
                     name=bufferedReader.readLine();
                     StudentDB.updateStudent(rollNo,name);
                    System.out.println("Record Updated Successfully");
                     break;

                case 3:
                    System.out.println("Enter The Roll No which record you want to delete");
                    rollNo=Integer.parseInt(bufferedReader.readLine());
                    StudentDB.deleteStudent(rollNo);
                    System.out.println("Record Deleted Successfully");
                    break;
                case 4:
                    StudentDB.displayStudent();
                    System.out.println("Press Enter To Continue!!!!!!!!!");
                    bufferedReader.read();
                    break;
                case 5:
                    System.out.println("Thanks!!!!!!!!!!!!!!!!!");
                    return;
                default:
                    System.out.println("Invalid Choice Enter Again from 1 to 5");
                    break;
            }
        }
    }
}