import java.util.*;
/*
 * Welcome to the number guessing game the user
 * will be able to guess the number in 10 trials according 
 * to which he/she will be scoring based on the number of
 * trial number
*/

// 100 points==> in 1 trial
// 90 points==> in 2 trail
// 80 points==> in 3 trial
// 70 points==> in 4 trial
// 60 points==> in 5 trail
// 50 points==> in  6 trial
// 40 points==> in 7 trial
// 30 Points==> in 8 trial
// 20 Points==> in 9 trial
// 10 Points==> in 10 trial
// 0 Points if no correct guessing
//iterate over k trials



public class App {
    public static void main(String[] args) throws Exception {
   
        	Scanner sc=new Scanner(System.in);
		
		System.out.println("WELCOME TO THE NUMBER GUESSING GAME");
		System.out.println("YOU HAVE GIVEN 10 ATTEMPTS TO GUESS A NUMBER ");
		System.out.println("BETWEEN 1-100 ");
		
		
		//generating number
		int number=1+(int)(100*Math.random());
		
		//given trials
		int k=10;
		int i,guess;
		int score=0;
		
	
		int c=0;
		
		for(i=0;i<k;i++) {
		
			
			System.out.println("Guess the number: ");
			
			
			// take input for guessing
			guess=sc.nextInt();
			
			//if the number is guessed
			
			if(number==guess) {
				System.out.println("Congratulations! You have Guessed the Number at "+(i+1)+" Attempt");
			score=100-i*10;
		c=1;
		break;
			}else if(number>guess){
				if(i==k-2) {
					System.out.println("Opps! Your Number is Smaller!");
					System.out.println("Try Again You Have Last Attempt Left");
					
				}else if(i==k-1){
					System.out.println("Opps! Your Number is Smaller!");	
				}
				else {	System.out.println("Opps! Your Number is Smaller!");
					System.out.println("Try Again You Have "+(k-i-1)+" Attempts Left");
					
				}
			
			}else if(number <guess) {
				if(i==k-2) {
					System.out.println("UMM..! Your number is Greater!");
					System.out.println("Try Again You Have Last Attempt Left");
						
				}if(i==k-1){
					System.out.println("UMM..! Your number is Greater! ");
					
				}
				else {	System.out.println("UMM..! Your number is Greater! ");
					System.out.println("Try Again You Have "+(k-i-1)+" Attempts Left");
						
				}
					}
		
		}
		if(c==1) {
			
			System.out.println("YOUR SCORE IS : "+score);
		}else {
            System.out.println("BETTER LUCK NEXT TIME YOUR SCORE IS 0 :(");
			System.out.println("The GENERATED NUMBER WAS : "+number);
				
		}
		

    }
}
