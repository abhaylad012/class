package DateDifference;

import com.abhay.DateDifference.data.MyDate;

public class DateDifferenceProvider {
	
	public int getDateDifference(MyDate StartDate, MyDate EndDate) {
		
		if((StartDate.getDd()==EndDate.getDd()) && (StartDate.getMm()==EndDate.getMm()) && (StartDate.getYyyy()==EndDate.getYyyy())) {
			System.out.println("Same date!!");
			return 0;
	}
		else if (SameMonth(StartDate, EndDate) && SameYear(StartDate, EndDate)) {
			System.out.println("Same Month Same years Different day");
			return (EndDate.getDd()-StartDate.getDd());
		}
		
		else if (SameYear(StartDate, EndDate)) {
			
		}
		
		return 1;
		
		
		
	}
	
	private boolean SameMonth(MyDate StartDate,MyDate EndDate) {
		
		return EndDate.getMm()==StartDate.getMm(); 
	}
	
	private boolean SameYear(MyDate StartDate,MyDate EndDate) {
		
		return EndDate.getYyyy()==StartDate.getYyyy(); 
	}
	
	
	private int RemainingDaysSameYear(MyDate StartDate,MyDate EndDate){
		
		
	}
	
	
}
