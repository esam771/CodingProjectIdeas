package CodingProjects;

public class CalendarDayPrinter {

	public static void main (String[] args) {
		// date, day of week, month number, total count number, total lines to generate
		printer(20, 5, 1, 151, 50);
	}
	
	private static void printer(int date, int weekDay, int monthNum, int dayNum, int numDays) {
		
		String week[] = {"Monday", "Tuesday", "Wednesday", "Thursday ", "Friday", 
				"Saturday ", "Sunday"};
		String[] months = {"January","February","March","April","May","June",
				"July","August","September","October","	November","	December"};
		int[] monthLength = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		for(int i = 0; i < numDays; i++) {
			String line = "            ";
			// adding day of the week
			line += week[(i + weekDay - 1) % 7] + ", ";
			
			// adding month
			line += months[monthNum - 1];
			
			//adding date
			line += " " + date;

			//adding letters after date
			switch(date % 10) {
			  case 1: line += "st";
			    break;
			  case 2: line += "nd";
			    break;
			  case 3: line += "rd";
			    break;
			  default: line += "th";
			}
			
			//adding calendar day number
			line +=  ", " + dayNum;
			
			//adding letters after day number
			switch(dayNum % 10) {
			  case 1: line += "st";
			    break;
			  case 2: line += "nd";
			    break;
			  case 3: line += "rd";
			    break;
			  default: line += "th";
			}
			
			// printing completed string
			System.out.println(line);
			System.out.println();
			
			
			//updating days and months
			dayNum++;
			date++;
			if(monthLength[monthNum-1] <= date - 1) {
				date = 1;
				monthNum++;
			}
		}
	}
}
