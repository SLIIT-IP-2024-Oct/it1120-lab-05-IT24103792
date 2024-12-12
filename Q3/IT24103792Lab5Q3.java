import java.util.Scanner;

        public class IT24103792Lab5Q3{

    public static void main(String []args) {

   Scanner input=new Scanner(System.in);

    
        int start_date,end_date,no_of_days;
        

  System.out.println("Enter start date (1-31)");
  start_date=input.nextInt;

  if(1>start_date){
  System.out.println("Days must be between 1 and 31");}
  else if(start_date>31){
  System.out.println("Days must be between 1 and 31");}
  
  else
  System.out.println("Enter end date (1-31)");
  end_date=input.nextInt;
 
  if(start_date>end_date){
  System.out.println("Start date must be less than end date");}
  
else{
  
   double room_charge; 
 System.out.println("Room charge per day :");
  room_charge=input.nextDouble;
 
  no_of_days=end_date-start_date;
 System.out.println("Number of days reserved :" +no_of_days);
  double total_amount;
 total_amount = (room_charge*no_of_days);
  double discount;
  switch(no_of_days) {

  case 1 :
   discount = (total_amount*0);
 total_amount= (total_amount)-(discount);
 System.out.println("Total Amount to be paid :" +total_amount);
   break;
   
   case 2:
     discount = (total_amount*0);
 total_amount= (total_amount)-(discount);
 System.out.println("Total Amount to be paid :" +total_amount);
   break;
     
  case 3 :
   discount = (total_amount*1/10);
 total_amount= (total_amount)-(discount);
  System.out.println("Total Amount to be paid :" +total_amount);
  break;
   
   case 4:
     discount = (total_amount*1/10);
   total_amount= (total_amount)-(discount);
  System.out.println("Total Amount to be paid :" +total_amount);
  break;

  default :
   discount =(total_amount*2/10);
   total_amount= (total_amount)-(discount);
  System.out.println("Total Amount to be paid :" +total_amount);

  }
}
}
 }