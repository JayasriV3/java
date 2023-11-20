package practice;

public class SwitchStatements {
public static void main(String[] args) {
	int season = 5;
	String seasonString;
	
	switch (season) {
	case 1:
		seasonString = "Summer";
		break;
	case 2:
		seasonString = "Autumn";
		break;
	case 3:
		seasonString = "winter";
		break;
	case 4:
		seasonString = "spring";
		break;
		default:
			seasonString = "Invalid season";
			break;		
	}
	System.out.println(seasonString);
}
}
