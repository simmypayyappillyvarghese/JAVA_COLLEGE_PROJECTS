/*
 To compute the numbers entered by user and display largest number,smallest number and average value.
 User enter the number repetively,and the last input is -1.
 */
/**
 *
 * @author Simmy Payyappilly Varghese
 */
import java.util.Scanner;
public class LargestAndSmallest86448 {

    public static void main(String[] args) {
    int i=1;                                          //Set a counter,for no of entries
    int number;
    int large_value=0; 
    int small_value=2147483647;                       //Set as the maximum value int can hold
    double Average_value;
    double sum=0.0;
       
      do{
           System.out.println("Enter number "+i +":");
           Scanner input=new Scanner(System.in);
           number=input.nextInt();
           
          if(!(number<=-1)){                         //If user enter a number greater than -1 ,Perform summation of those numbers
           sum=sum+number;
          }
          if(number<-1){                             //If user enter a value less than -1,below error should be thrown and user is prompted to enter the number again.
           System.out.println("*** Input number can not be less than -1. Try again.");
           continue;                                 // Skips the following statements and exits the loop and force user to enter valid number
          }
          if(large_value<number){
           large_value=number;
          }
          if((number!=-1)&&(small_value>number)){    //To avoid taking -1 as the smallest value
           small_value=number;
          }
          if (number<=-1){ 
           i--;                                     //Reduce the number of entries,if user enters -1 or -2
          }
            Average_value=sum/i;                     
          if((number==-1)&&(i!=0)){                //To avoid printing following values if user prints -1 as the first entry
              
           System.out.println("The largest value is "+large_value); 
           System.out.println("The smallest value is "+small_value);
           System.out.println("The average value is "+Average_value);
          }
          i++;
       }while((number <-1)||(number>-1));
        } }
    

