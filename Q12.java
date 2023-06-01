import java.util.Scanner;
public class Q12 {

	public static void main(String[] args) {
		System.out.println("This is a Trivia Game!!");
		System.out.println("There is 5 question for you.");
		System.out.println("Questions have different point based on the difficulty of the question.");
		System.out.println("Let's start!!");
		
		int totalPoint = 0;
		
		String[] questions = new String[5];
			questions[0]="What is the capital of Turkey?";
			questions[1]="What is the plate number of Konya";
			questions[2]="What is the square of 12?";
			questions[3]="What year was Atatürk born?";
			questions[4]="How much is 5-3?";

		String[] answers = new String[5];
				answers[0]="Ankara";
				answers[1]="42";
				answers[2]="144";
				answers[3]="1881";
				answers[4]="2";
		
		int[] points = new int[5];
				points[0]=1;
				points[1]=2;
				points[2]=5;
				points[3]=3;
				points[4]=2;
	   
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<questions.length; i++) {
		System.out.println("Question: " + questions[i]);
		String a1 = scan.nextLine();
		if(a1.equals(answers[i])) {
			System.out.println("Correct answer!!");
			totalPoint = totalPoint + points[i];
		}else {
			System.out.println("Wrong answer!!");
			System.out.println("The answer is: " + answers[i]);
		}
		}
		System.out.println("The game is over!!");
		System.out.println("Your total point is: " + totalPoint);
		
		
		
		
	}

}
