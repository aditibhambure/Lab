public class Swap{
  public static void main(String[] args) {
     // int, double, float
   int a, b;
   a = 9;
   b = 4;
   System.out.println("Before swapping : a, b = "+a+", "+ + b);
   a = a + b;
   b = a - b;
   a = a - b;
   System.out.println("After swapping : a, b = "+a+", "+ + b);
 }
 
}