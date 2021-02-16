/*
	Understanding switch-case by printing a calendar
	Created by Aashish Loknath Panigrahi
*/

package chp1;
import java.time.*;
public class PrintCalendar{
	public static void main(String args[]){

		//Stores number of days in 12 months
		int monthDays[] = new int[12];
		monthDays[0]=31;
		monthDays[2]=31;
		monthDays[3]=30;
		monthDays[4]=31;
		monthDays[5]=30;
		monthDays[6]=31;
		monthDays[7]=31;
		monthDays[8]=30;
		monthDays[9]=31;
		monthDays[10]=30;
		monthDays[11]=31;

		//Getting current year using Year object
		Year thisYear = Year.now();

		//Converting year object to string & then to int
		int currentYear = Integer.parseInt(thisYear.toString());

		//Checking whether leap year or not
		if(currentYear%4==0){
			if(currentYear%100==0){
				if(currentYear%400==0){
					monthDays[1] = 29;
				}
				else{
					monthDays[1] = 28;
				}
			}
			else{
				monthDays[1] = 28;
			}	
		}
		else{
			monthDays[1] = 29;
		}

		//Printing calendar
		for(int i=0;i<monthDays.length;i++){
			System.out.printf("\nMonth %d :\n",i);
			for(int j=1;j<=monthDays[i];j++){
				System.out.printf("%d   ",j);
				if(j%5==0){
					System.out.println();
				}
			}
		}
	}
}