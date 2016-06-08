/**
 * This program reads input scores, finds the minimum score, calculates the total scoreby dropping the minimum, 
 * and displays average of all scores
 * 
 * */

import java.util.*;

public class Solution {

	public static void main(String[] args) {

            double[] scores = readInputs(); // calling Method to read score from
                                                                            // the user
            double sum = sum(scores); // calculating sum of the scores
            double length = scores.length;
            
            double total = sum;
            if (length > 1)
                total = sum - minimum(scores);
            System.out.println();
            System.out.println("FINAL SCORE AFTER DROPPING THE MINIMUM = " + total);
            System.out.println("AVERAGE OF ALL SCORES = " + sum / length);
           
	}

        /**
         * Method to read score into array
         * @return array of scores
         */
	static double[] readInputs()  
													
	{
		
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the score count: "); // score count reading from  user
                                                                                                    
            int score_count = in.nextInt();

            while  (score_count <= 0) { // score count cannot be zero
                System.out.println("Enter a positive score count: ");
                score_count = in.nextInt();
            }

            double scores[] = new double[score_count];


            for (int i = 0; i < score_count; i++) {
               System.out.println("Enter a  score number : ");
               double temp = in.nextDouble();
               while (temp < 0) {
                   System.out.println("Invalid score, enter a number greater than or equal 0:  ");
                   temp = in.nextDouble();
               }
               scores[i] = temp;
              
            }


            return scores; // returning scores to the calling method
	}
        /** Method to calculate sum of the scores
         * 
         * @param scores array
         * @return sum of array elements
         */
        
	static double sum(double[] scores) 
	{
		 
		double total = 0;
		for (double element : scores) {
                    total = total + element;
		}
		return total; 
	}
        
        /** Method to find minimum score in an array
         * @param input array
         * @return minimum score
         */
	static double minimum (double[] scores) 
											
	{
            if (scores.length == 0)
                return -1;
            
            double smallest = scores[0];
            for (int i = 1; i < scores.length; i++) {
                if (scores[i] < smallest) {
                    smallest = scores[i];
                }
            }

            return smallest;
	}
}
