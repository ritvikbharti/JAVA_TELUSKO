import java.util.Scanner;
class Hello
{
    public static void main(String[] args){
     
        Scanner sc = new Scanner(System.in);

      int a = 0, b = 0;

      if (sc.hasNextInt()) a = sc.nextInt();
      if (sc.hasNextInt()) b = sc.nextInt();
      int c = a+b;
      System.out.println("Addition: "+ (c));
      System.out.println("Substraction: " + (a-b));
      System.out.println("Multiplication: "+ (a*b));
      
       
  }

}




  
