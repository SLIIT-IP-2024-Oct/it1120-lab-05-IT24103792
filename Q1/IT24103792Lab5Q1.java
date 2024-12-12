import java.util.Scanner;

        public class IT24103792Lab5Q1{

    public static void main(String []args) {

   int first_integer,second_integer,third_integer;
   Scanner input= new Scanner(System.in);

    
  System.out.println("Enter the first integer");
    first_integer=input.nextInt();

    
  System.out.println("Enter the second integer");
    second_integer=input.nextInt();

  System.out.println("Enter the third integer");
    third_integer=input.nextInt();

  System.out.println("User entered numbers are :" + first_integer + " " + second_integer + " " + third_integer);

   int smallest = Math.min(first_integer, Math.min(second_integer, third_integer));
        int largest = Math.max(first_integer, Math.max(second_integer, third_integer));

        
        System.out.println("The smallest number is: " + smallest);
        System.out.println("The largest number is: " + largest);


}
  }