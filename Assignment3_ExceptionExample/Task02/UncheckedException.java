import java.util.*;
class UncheckedException {
   public static void main(String args[])
   {
        int no1,no2,output=0;
        try{
                no1=10;
                no2=0;
                //Because of dividing integer with 0, it should throw ArithmeticException

                output=no1/no2;
        }
        catch (ArithmeticException e) {
                 e.printStackTrace();
                 System.out.println("There's an Arithmetic Exception");
        }
        System.out.println(output);
   }
}

