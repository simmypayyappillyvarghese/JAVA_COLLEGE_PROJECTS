/*
 * To estimate the sum of scores after dropping the lowest one from the list of scores 
   Also calculate the average of the scores.
/**
 *
 * @author Simmy Payyappilly Varghese
 */

import java.util.Scanner;
public class ScoreCalculator86448 {

     
        public static void main(String[] args) {
        System.out.println("Enter the score count:");        
        Scanner input=new Scanner(System.in);
        int count=input.nextInt();                                              //Count is the number of scores user will enter
        
        double scores[]=readInputs(count);                                      //Calling method readInputs() and count is passed.
        double finalScore=sum(scores,count)-minimum(scores,count);              //Calling the method sum() and minimum() and score[] as well as count is passed
        System.out.printf("Sum of the scores after removing the minimum score :"+"%.2f",finalScore);
        System.out.println();
        double average=average(scores,count);                                   //Calling method average() 
        System.out.printf("Average of the scores including the minimum score:"+"%.2f",average);   
        System.out.println();
        }
        
     /**
      For accepting the scores from the user.
      @param count-number of scores entered by user
      @return quizScores-list of scores
      */
        
        public static double[] readInputs(int count){
          double[] quizScores = new double[count];
          System.out.println("Enter the Scores :");
          Scanner input=new Scanner(System.in);
          for(int i=0;i<count;i++){
          quizScores[i]=input.nextDouble();
           } 
          
           return quizScores; 
        }
        
      /**
      For calculating the sum of the scores.
      @param scores-array of scores
      @param count-number of scores entered by user
      @return total-sum of the scores
      */
      
        public static double sum(double[] scores,int count){
              double total=0.0;
           for(int i=0;i<count;i++){
               total=total+scores[i];
           }
           return total;
        }
        
      /**
      For calculating the minimum value of the scores.
      @param scores-array of scores
      @param count-number of scores entered by user
      @return smallest-minimum value of score
      */
        
        public static double minimum(double[] score,int count){
          double smallest=score[0];
          int j=0;
            for(int i=1;i<count;i++){
              
          if(smallest>score[i]){
             smallest=score[i];
              j=i;
          }}
            
            System.out.println("Minimum score is "+smallest+ " at position "+j); 
            return smallest;
          }
        
      /**
      For calculating the average of the list of scores.
      @param scores-array of scores
      @param count-number of scores entered by user
      @return average-average value of scores
      */
        
        
        public static double average(double[] score,int count){
           double total=0.0;
           for(int i =0;i<count;i++){
             total=total+score[i];
           }
           double average=total/count;
           return average;
        }


    }
    
