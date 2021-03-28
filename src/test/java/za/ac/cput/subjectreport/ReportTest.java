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
@Disabled("Disabled by assignment instruction")
public class ReportTest {
     
    
    @BeforeEach
    public void setUp() {
            
    }
    
    @Test 
    @Timeout (5) 
    public void testStudentName() throws InterruptedException{
       Report student1 = new Report();
       
       String expected = student1.getName();
       String actual = "Breyton";
       assertEquals(expected,actual);
      
       assertSame("Breyton",student1.getName());   //tests for identity
       assertNotSame("John",student1.getName()); //name shouldnt be identical
       
       Thread.sleep(4000);
       System.out.println("Test sucessfully passed within time");
       
    }

    @Test
    @Timeout (5)
    public void testStudentSurname() throws InterruptedException{
       Report student2 = new Report();
       
       String expected = student2.getSurname();
       String actual = "Ernstzen";
       assertEquals(expected,actual); //Test for equality
       
       assertSame("Ernstzen",student2.getSurname());//Checks for identity
       assertNotSame("Adams",student2.getSurname());//Object is not identical 
       
       Thread.sleep(4000);
       System.out.println("Test sucessfully passed within time");
    }

    @Test
    @Timeout (5)
    public void testStudentNumber() throws InterruptedException{ //Come back to this method again
        Report student3 = new Report();
        Report student4 = student3;
        Report student5 = new Report();
        
        long expected = student3.getStudentNumber();
        long actual = 217203027;
        assertEquals(expected, actual);//Test for equality
        
        assertSame(student3,student4);//Checks for identity
        assertNotSame(student3,student5);//Object is not identical 
        
        Thread.sleep(4000);
        System.out.println("Test sucessfully passed within time");
    }

    @Test 
    @Timeout(5)
    public void testStudentCourse() throws InterruptedException{
        Report student6 = new Report();
        Report twinStudent = student6;
        
        String expected = student6.getCourse();
        String actual = "Applications Development";
        assertEquals(expected, actual);//Test for equality
        
        assertSame(student6,twinStudent); //Checks for identity
        assertNotSame("Sports Management",student6.getCourse());  //Object is not identical     
        
        Thread.sleep(4000);
        System.out.println("Test sucessfully passed within time");
    }
    
    @Test 
    @Timeout(5)
    public void testAverageMark() throws InterruptedException{
        Report student1 = new Report();
        Report student2 = student1;
        Report student3 = new Report();
        
        double expected = student1.getAverageMark();
        double actual = 50;
        assertEquals(expected,actual);//Test for equality
        
        assertSame(student1,student2);//Checks for identity
        assertNotSame(student3,student2);//Object is not identical
        
        Thread.sleep(4000);
        System.out.println("Test sucessfully passed within time");
    }
 
    
}
