/**
 * 
 */
package com.designPatterns.creational.factory;

/**
 * @author : SantoshPC
 * @description : Class DoorAssignment implements AssignmentInterface Interface , Class is design to implement getData,showData methods
 * 
 */
public class DoorAssignment implements AssignmentInterface {

	/**
	 * @Class: DoorAssignment
	 * @description : method "getData" is designed to to get user input data and perform activity.
	 * @param : doorCount : Integer
	 * @return : doorList : Integer []
	 */
	@Override
	public int[] getData(int doorCount) {
		
		int doorList[] = new int[doorCount]; 

			for (int j = 1; j < doorCount; j++) { 
			int count = 0; 
			for (int i = 1; i <= j; i++) { 
			if (j % i == 0) { 
			count++; 
			} 
			} 
			if (count % 2 == 1) { 
				doorList[j] = 1; 
				} else 
				doorList[j] = 0; 
			}
		return doorList; 
}

	/**
	 * @Class: DoorAssignment
	 * @description : method "showData" is designed to to get user input data and display data.
	 * @param : doorList : Integer []
	 * @return : void
	 */
	@Override
	public void showData(int[] doorList) {
		
		for (int i = 1; i < doorList.length; i++) { 
			if(doorList[i] == 1){ 
				System.out.println("Door "+ i +" is open"); 
			} 
			else 
				System.out.println("Door "+ i +" is close"); 
			}		
	}

	
}
