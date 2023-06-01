import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		
		String[][] seat = new String[][] {
			{"A" , "B", "C", "D"},
			{"A" , "B", "C", "D"},
			{"A" , "B", "C", "D"},
			{"A" , "B", "C", "D"},
			{"A" , "B", "C", "D"},
			{"A" , "B", "C", "D"},
			{"A" , "B", "C", "D"}
		};
		System.out.println("Seat plan of the airplane is: ");
			for(int i=0; i< seat.length ; i++) {
				System.out.print((i+1) + " ");
				for(int j=0; j < seat[0].length ; j++) {
					System.out.print(seat[i][j] + " ");
				}
				System.out.println();
			}
		
		boolean run = true;
		int seatNameNumber;
		
		do {
		System.out.println("Please enter a seat number. (Such as 1)");
		Scanner scan = new Scanner(System.in);
		int seatNo = scan.nextInt();
		System.out.println("Please enter a seat name. (Such as A)");
	    String seatName = scan.next();
	    if(seatName.equals("A")) {
	    	seatNameNumber = 0;
	    }else if(seatName.equals("B")) {
	    	seatNameNumber = 1;
	    }else if(seatName.equals("C")) {
	    	seatNameNumber = 2;
	    }else {
	    	seatNameNumber = 3;
	    }
	    
	    
	    for(int i=0; i<seat.length; i++) {
	    	for(int j=0; j< seat[0].length; j++) {
	    		if(!seat[i][j].equals("X")) {
	    			break;
	    		}else if(seat[i][j].equals("X")) {
	    		if(j==3 && i==6 && seat[seat.length][seat[0].length].equals("X")) {
	    				System.out.println("All seats are taken!!");
		    			run = false;
	    		}
	    			continue;
	    		
	    	}
	    }
	    }
	    
	     
		System.out.println("You choose the seat " + seatNo + seatName + ".");
		
		
		if(seat[seatNo-1][seatNameNumber].equals("X")) {
		    	System.out.println("This seat is already taken!!");
		    	System.out.println("Choose another seat.");
		}else {
		    	seat[seatNo-1][seatNameNumber] = "X";
		}
		System.out.println("Current seat plan of the airplane is: ");
		for(int i=0; i< seat.length ; i++) {
			System.out.print((i+1) + " ");
			for(int j=0; j < seat[0].length ; j++) {
				System.out.print(seat[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("If you want to choose another seat type 1, if you want to end the program type 2.");
		int type = scan.nextInt();
		if(type==1) {
			continue;
		}else {
			System.out.println("End of the program.");
			break;
		}
		
		
		
		}while(run);
		
		
		
		
		
		
		
	}

}
