/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.subjectreport;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTimeout;
//import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Rule;
import org.junit.Ignore;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

/**
 *
 * @author Breyton Ernstzen
 */
@Disabled("Disable all tests by assignment instruction")
public class ReportTest {
         
    @Test 
    @Timeout (5) 
    public void testStudentName() throws InterruptedException{
       Report studentName = new Report();
       
       String expected = studentName.getName();
       String actual = "Breyton";
       assertEquals(expected,actual);
      
       assertSame("Breyton",studentName.getName());   //tests for identity
       assertNotSame("John",studentName.getName()); //name shouldnt be identical
       
       Thread.sleep(4000);
       System.out.println("Test sucessfully passed within time");
       
    }

    @Test
    @Timeout (5)
    public void testStudentSurname() throws InterruptedException{
       Report studentSurname = new Report();
       
       String expected = studentSurname.getSurname();
       String actual = "Ernstzen";
       assertEquals(expected,actual); //Test for equality
       
       assertSame("Ernstzen",studentSurname.getSurname());//Checks for identity
       assertNotSame("Adams",studentSurname.getSurname());//Object is not identical 
       
       Thread.sleep(4000);
       System.out.println("Test sucessfully passed within time");
    }

    @Test
    @Timeout (5)
    public void testStudentNumber() throws InterruptedException{ //Come back to this method again
        Report studentSurname1 = new Report();
        Report studentSurname2 = studentSurname1;
        Report studentSurname3 = new Report();
        
        long expected = studentSurname1.getStudentNumber();
        long actual = 217203027;
        assertEquals(expected, actual);//Test for equality
        
        assertSame(studentSurname1,studentSurname2);//Checks for identity
        assertNotSame(studentSurname1,studentSurname3);//Object is not identical 
        
        Thread.sleep(4000);
        System.out.println("Test sucessfully passed within time");
    }

    @Test 
    @Timeout(5)
    public void testStudentCourse() throws InterruptedException{
        Report studentCourse = new Report();
        Report twinStudent = studentCourse;
        
        String expected = studentCourse.getCourse();
        String actual = "Applications Development";
        assertEquals(expected, actual);//Test for equality
        
        assertSame(studentCourse,twinStudent); //Checks for identity
        assertNotSame("Sports Management",studentCourse.getCourse());  //Object is not identical     
        
        Thread.sleep(4000);
        System.out.println("Test sucessfully passed within time");
    }
    
    @Test 
    @Timeout(5)
    public void testAverageMark() throws InterruptedException{
        Report student1Average = new Report();
        Report student2Average = student1Average;
        Report student3Average = new Report();
        
        double expected = student1Average.getAverageMark();
        double actual = 50;
        assertEquals(expected,actual);//Test for equality
        
        assertSame(student1Average,student2Average);//Checks for identity
        assertNotSame(student3Average,student2Average);//Object is not identical
        
        Thread.sleep(4000);
        System.out.println("Test sucessfully passed within time");
    }
 
    
}
