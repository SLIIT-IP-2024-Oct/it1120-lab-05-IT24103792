import java.util.Scanner;

        public class IT24103792Lab5Q2{

    public static void main(String []args) {

   Scanner input=new Scanner(System.in);

  int newMember;
  System.out.println("Enter the number of new members introduced ;");
  newMember=input.nextInt();

  if(0>newMember) {
  System.out.println("Input must be a number 0 or greater");
}
 else {
  String prize;

 switch(newMember) {

 case 0 : 
  prize ="No price";
  break;

 case 1 :
  prize ="Pen";
  break;

 case 2 :
  prize ="Umbrella";
  break;

 case 3 :
  prize ="Bag";
  break;

 case 4 :
  prize ="Travelling chair";
  break;

 default :
  prize ="Headphone";
}

  System.out.println("Price is a :" +prize);
}
  

}
 }