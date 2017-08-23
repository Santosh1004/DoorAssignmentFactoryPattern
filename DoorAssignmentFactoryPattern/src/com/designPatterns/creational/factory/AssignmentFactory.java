/**
 * 
 */
package com.designPatterns.creational.factory;


/**
 * @author : SantoshPC
 * @description : Class AssignmentFactory , Class is design to handle Factory Design pattern
 * 
 */
public class AssignmentFactory {

	public AssignmentInterface createAssignment(String typeOfAssignment){
		
		if(typeOfAssignment == null){
			return null;
		}
		
		if("DoorAssignment".equalsIgnoreCase(typeOfAssignment)){
			return new DoorAssignment();
		}
		 
		return null;
	}
	
	
}
