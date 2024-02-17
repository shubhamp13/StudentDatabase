package org.student;

import java.sql.*;

public class DB
{
    static Connection connection=null;
    public  static  Connection con()
    {
        try
        {
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3310/bca","root","root");

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return connection;
    }


}
