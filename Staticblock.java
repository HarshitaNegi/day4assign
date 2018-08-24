class Staticblock
{
   static int num;
   static String x;
   static
   {
      num = 97;
      x = "Hello, how are you?";
   }
   public static void main(String args[])
   {
      System.out.println("Value of num is "+num);
      System.out.println("Value of x is "+x);
   }
}