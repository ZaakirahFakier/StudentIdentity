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
 * @author Breyton Ernstzen - 217203027
 */

public class ReportTest {
         
    @Test 
    public void testEquality() throws InterruptedException{ //This method checks for objcect quality
       Report studentName = new Report();
       Report studentSurname = new Report();
       Report studentNumber = new Report();
       Report studentCourse = new Report();
       Report studentAverage = new Report();
       
       String expectedName = studentName.getName();
       String actualName = "Breyton";
       assertEquals(expectedName,actualName);
       
       String expectedSurname = studentSurname.getSurname();
       String actualSurname = "Ernstzen";
       assertEquals(expectedSurname,actualSurname);
        
       long expectedStudentNumber = studentNumber.getStudentNumber();
       long actualStudentNumber = 217203027;
       assertEquals(expectedStudentNumber,actualStudentNumber);
       
       String expectedCourseName = studentCourse.getCourse();
       String actualCourseName = "Applications Development";
       assertEquals(expectedCourseName,actualCourseName);//Test for equality
       
       double expectedAverage = studentAverage.getAverageMark();
       double actualAverage = 50;
       assertEquals(expectedAverage,actualAverage);//Test for equality
      
       assertSame("Breyton",studentName.getName());   //tests for identity
       assertNotSame("John",studentName.getName()); //name shouldnt be identical
           
    }

    @Test
    public void testIdentity() throws InterruptedException{ //This method checks for object identity
       Report studentName = new Report();
       Report studentSurname = new Report();
       Report studentNumber = new Report();
       Report studentCourse = new Report();
       Report studentAverage = new Report();Report student2Average = studentAverage;
       
       assertSame("Breyton",studentName.getName());   //tests for identity
       assertNotSame("John",studentName.getName());
       
       assertSame("Ernstzen",studentSurname.getSurname());//Checks for identity
       assertNotSame("Adams",studentSurname.getSurname());//Object is not identical 
       
       assertSame(studentAverage,student2Average);//Checks for identity
       assertNotSame(studentCourse,studentNumber);//Object is not identical
             
    }

    @Test
    public void testFailure() throws InterruptedException{  //This methods dileberately fails a test
       Report studentName = new Report();
       Report studentSurname = new Report();
       
       String expectedName = studentName.getName();
       String actualName = "John";
       assertEquals(expectedName,actualName);
       
       String expectedSurname = studentSurname.getSurname();
       String actualSurname = "Doe";
       assertEquals(expectedSurname,actualSurname);
     
    }

    @Test 
    @Timeout(5)
    public void testTimeout() throws InterruptedException{ //This method checks for timeout
        Thread.sleep(4000); //Timeout in miliseconds
        System.out.println("Test sucessfully passed within time");
    }
    
    @Test 
    @Disabled("Disable all tests by assignment instruction")
    public void testDisabling() throws InterruptedException{ //This method disables a test
       Report studentName = new Report();
       Report studentSurname = new Report();
       
       String expectedName = studentName.getName();
       String actualName = "John";
       assertEquals(expectedName,actualName);
       
       String expectedSurname = studentSurname.getSurname();
       String actualSurname = "Doe";
       assertEquals(expectedSurname,actualSurname);
    }
 
    
}
