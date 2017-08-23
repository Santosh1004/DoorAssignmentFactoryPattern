/**
 * 
 */
package com.accenture.assignment.Junit;

import org.junit.Test;

import com.designPatterns.creational.factory.AssignmentFactory;
import com.designPatterns.creational.factory.AssignmentInterface;

/**
 * @author : SantoshPC
 * @description : Class DoorAssignmentTest , Class is design to test junit 
 * 
 */
public class DoorAssignmentTest {

	@Test
	public void test(){
		int[] doorList = null;
		AssignmentFactory assignmentFactory = new AssignmentFactory();
		AssignmentInterface assignmentObj = assignmentFactory.createAssignment("DoorAssignment");

		doorList = assignmentObj.getData(101);
		assignmentObj.showData(doorList);

	}
}
