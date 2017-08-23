/**
 * 
 */
package com.designPatterns.creational.factory;

import java.util.Scanner;

import org.apache.log4j.Logger;


/**
 * @author : SantoshPC
 * @description : Class AssignmentFactoryTest , Class is design to execute stand alone execution of DoorAssignmentFactoryPattern project
 * 
 */
public class AssignmentFactoryTest {

	public static void main(String args[]) {
		
		Logger log = Logger.getLogger(AssignmentFactoryTest.class);
		
		// Declaration of variables
		int doorCount = 0;		
		int[] doorList = null;
		
		// Reading from System.in
		Scanner reader = new Scanner(System.in); 
		
		System.out.println("Enter Assignement Type (DoorAssignment/....): ");
		String assignType = reader.nextLine();
		
		if(assignType.equalsIgnoreCase("DoorAssignment")){
			System.out.println("Enter Number of Doors for DoorAssignment : ");
			doorCount = reader.nextInt();
		}
		
		// Factory object creation	
		AssignmentFactory assignmentFactory = new AssignmentFactory();
		
		try {
			// Object creation as per user inputs
			AssignmentInterface assignmentObj = assignmentFactory.createAssignment(assignType);
			
			// Method call as per user input 
			doorList = assignmentObj.getData(doorCount);
			assignmentObj.showData(doorList);

		} catch (Exception ex) {
			log.error(ex);
		}	
		
	}
}
