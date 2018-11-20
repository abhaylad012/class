package com.abhay.DateDifference.supp;

import com.abhay.DateDifference.data.MyDate;

public class MyTestRecord {
	
	MyDate StartDate;
	MyDate EndDate;
	int ActualDiff;
	
	public MyTestRecord(MyDate startDate, MyDate endDate, int actualDiff) {
		super();
		this.StartDate = startDate;
		this.EndDate = endDate;
		this.ActualDiff = actualDiff;
	}
	
	
	public MyDate getStartDate() {
		return StartDate;
	}
	public void setStartDate(MyDate startDate) {
		StartDate = startDate;
	}
	public MyDate getEndDate() {
		return EndDate;
	}
	public void setEndDate(MyDate endDate) {
		EndDate = endDate;
	}
	public int getActualDiff() {
		return ActualDiff;
	}
	public void setActualDiff(int actualDiff) {
		ActualDiff = actualDiff;
	}
	

}
