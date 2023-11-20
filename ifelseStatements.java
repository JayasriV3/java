package practice;

public class ifelseStatements {
public static void main(String[] arg) {
	int testscore = 100;
	char grade;
	
	if (testscore >= 91) {
		grade = 'D';
	}
	else if (testscore >= 81) {
		grade = 'A';
	}
	else if (testscore >= 51) {
		grade = 'B';
	}
	else if (testscore >= 41) {
		grade = 'C';
	}
	else{
		grade = 'F';
	}
	System.out.println("The Grade is " + grade);
}
}
