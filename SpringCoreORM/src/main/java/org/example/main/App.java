package org.example.main;

import org.example.dao.StudentDao;
import org.example.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){

        System.out.println( "Hello World!" );

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);

        /*//create
        *//*Student s1 = new Student(2,"lala yadav","Noida");
        int res = studentDao.insert(s1);
        System.out.println("Done" + res);*//*

        //read
        System.out.println("The student I got was :" + studentDao.getStudent(1));

        //read all

        List<Student> students = studentDao.getAllStudents();
        for(Student s: students)
        {
            System.out.println(s);
        }

        //remove student

        //System.out.println("Remove student" + studentDao.removeStudent(1));

        //update

        Student s1 = new Student(2,"Mainak Ghosh","Noida");
        studentDao.updateStudent(s1);//updated the row with the given primary key*/


        //menu driven application

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean exit  = false;
        int id;
        String name;
        String city;

        while(!exit)
        {
            System.out.println("Press 1 for adding new student");
            System.out.println("Press 2 for display all student");
            System.out.println("Press 3 for get details of single student");
            System.out.println("Press 4 for delete  students");
            System.out.println("Press 5 for updating student");
            System.out.println("Press 6 for exit.....");

            try {
                int input = Integer.parseInt(br.readLine());

                switch (input)
                {
                    case 1:
                        //add student
                        System.out.print("Enter id :");
                        id = Integer.parseInt(br.readLine());

                        System.out.print("Enter name :");
                        name = br.readLine();

                        System.out.print("Enter city :");
                        city = br.readLine();

                        Student student = new Student(id,name,city);
                        int res = studentDao.insert(student);
                        System.out.println("Inserted a row with id " + res);

                        break;
                    case 2:
                        //display all student
                        List<Student> students = studentDao.getAllStudents();
                        for(Student s: students)
                        {
                            System.out.println(s);
                        }
                        break;
                    case 3:
                        //get details of single student
                        System.out.println("Enter id of student you want to view ");
                        id = Integer.parseInt(br.readLine());
                        System.out.println("The student I got was :" + studentDao.getStudent(id));

                        break;
                    case 4:
                        //delete  students
                        System.out.println("Enter id of student you want to delete ");
                        id = Integer.parseInt(br.readLine());
                        System.out.println("Remove student" + studentDao.removeStudent(id));
                        break;
                    case 5:
                        //updating student
                        break;
                    case 6:
                        //exit.....
                        exit = true;
                        break;
                }
            } catch (IOException e) {
                System.out.println("invalid input...try with another one");
                System.out.println(e.getMessage());
                //e.printStackTrace();
            }


        }
        System.out.println("Thanks for using App");







    }
}
