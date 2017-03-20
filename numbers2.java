//input a date, such as 2017, 3, 20. how many days from 1, 1 of this year?
public class numbers2 {
	public static void main(String[] args) {
		int year = 2020;
		int month = 12;
		int day = 31;
		int Feb;
		int sum = 0;

		if (!(year % 100 == 0)&&year%4==0 || year % 400 == 0) {
			Feb = 29;
		} else {
			Feb = 28;
		}

		switch (month) {
		case 1:
			sum = day;
			break;
		case 2:
			sum = 31 + day;
			break;
		case 3:
			sum = 31 + Feb + day;
			break;
		case 4:
			sum = 31 + Feb + 31 + day;
			break;
		case 5:
			sum = 31 + Feb + 31 + 30 + day;
			break;
		case 6:
			sum = 31 + Feb + 31 + 30 + 31 + day;
			break;
		case 7:
			sum = 31 + Feb + 31 + 30 + 31 + 30 + day;
			break;
		case 8:
			sum = 31 + Feb + 31 + 30 + 31 + 30 + 31 + day;
			break;
		case 9:
			sum = 31 + Feb + 31 + 30 + 31 + 30 + 31 + 31 + day;
			break;
		case 10:
			sum = 31 + Feb + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
			break;
		case 11:
			sum = 31 + Feb + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
			break;
		case 12:
			sum = 31 + Feb + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;
			break;
		}
		
		System.out.println("The day that input is " + sum + " days");
	}

}
