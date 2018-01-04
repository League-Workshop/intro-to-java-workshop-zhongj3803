package day4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
	int score = 0;	
		// 2.  Ask the user a question 
	String answer = JOptionPane.showInputDialog("What's nine plus ten?");	
		// 3.  Use an if statement to check if their answer is correct
	    if(answer.equals("19")) {
	    
		// 4.  if the user's answer is correct
	              
		// -- add one to their score 
	     score++;   
	     
	    }
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
	   
	    answer = JOptionPane.showInputDialog("The Law of Conservation of Mass states that matter cannot be created or ______");
	 if(answer.equals("destroyed")) {
		 score++;
	 }
        answer = JOptionPane.showInputDialog("Identify the slope of this line: y=234x+62");
         if(answer.equals("234")) {
        	 score++;
         } 	 	 
       answer=JOptionPane.showInputDialog("When the Continental Army was fighting the British, they often used ________ warfare");
        	 if(answer.equals("guerilla")) {
        		 score++;
        	 }  
        		answer=JOptionPane.showInputDialog("This person is the author of 'A Midsummer Night's Dream'");
        		 if(answer.equals("William Shakespeare")) {
        			 score++;	 
        		 }
        		 System.out.println(score); 
	}	 
        	 
	}
	 
		// 6.  After all the questions have been asked, print the user's score 
		
	

