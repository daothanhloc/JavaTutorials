/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorials;
import java.io.*;
/**
 *
 * @author daothanhloc
 */
public class EmployeeTest {
 
    public static void main(String arg[]) {
        Employee empOne = new Employee("James Smith");
        Employee empTwo = new Employee("Mary Anne");

      // Invoking methods for each object created
        empOne.empAge(26);
        empOne.empDesignation("Senior Software Engineer");
        empOne.empSalary(1000);
        empOne.printEmployee();

        empTwo.empAge(21);
        empTwo.empDesignation("Software Engineer");
        empTwo.empSalary(500);
        empTwo.printEmployee();
    }

}
