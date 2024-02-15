Databse Name is :bca

Table Name is student.



CREATE TABLE `student` (
  `stud_id` int NOT NULL,
  `stud_name` varchar(45) NOT NULL,
  `stud_address` varchar(45) NOT NULL,
  `stud_phoneNo` varchar(10) NOT NULL,
  PRIMARY KEY (`stud_phoneNo`),
  UNIQUE KEY `stud_id_UNIQUE` (`stud_id`)
);

NOTE:

1.I have used 3310 port for my sql.
2.Your by default port is 3306 you should write port number acording to your system configration.

