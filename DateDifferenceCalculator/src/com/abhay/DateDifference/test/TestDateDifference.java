package com.abhay.DateDifference.test;

import com.abhay.DateDifference.data.MyDate;
import com.abhay.DateDifference.supp.MyTestRecord;
import com.abhay.DateDifference.supp.MyTestRecord;

import DateDifference.DateDifferenceProvider;

public class TestDateDifference {
	
	
	
	
	
	public static void main(String[] args) {
		
		DateDifferenceProvider provider = new DateDifferenceProvider();
		
		MyTestRecord[] myTestRecords = new MyTestRecord[2];
		
		myTestRecords[0] = new MyTestRecord(new MyDate(20, 11, 2018), new MyDate(20, 11, 2018), 0);
		myTestRecords[1] = new MyTestRecord(new MyDate(20, 11, 2018), new MyDate(25, 11, 2018), 5);
		
		for (int index=0; index < myTestRecords.length; index++) {
			int calculatedDiff = provider.getDateDifference(myTestRecords[index].getStartDate(),
					myTestRecords[index].getEndDate());
			if (calculatedDiff == myTestRecords[index].getActualDiff()) {
				System.out.println("Test Case passed");
			} else {
				System.err.println("Test Case failed"+" Actual =" + myTestRecords[index].getActualDiff()+ " calculated ="+ calculatedDiff);
			}

		}
	}
}
