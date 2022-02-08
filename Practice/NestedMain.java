package Week4.Session15.Practice;

import java.util.Scanner;

public class NestedMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 12 ,result = 0 ;
        Object o = null;
        System.out.println("Enter value of 'b' .");
        int b = scanner.nextInt();

        try{
            result = a/b;
           try {
               System.out.println(o.toString());
           } catch (NullPointerException e) {
               System.out.println("Null Pointer Exception Caught :: "+e.getMessage());
           } finally {
               System.out.println("Inner Finally ");
           }
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught :: "+e.getMessage());
        } finally {
            System.out.println("Outer Finally ");
        }

    }
}

/*

Enter value of 'b' .
1
Null Pointer Exception Caught :: Cannot invoke "Object.toString()" because "o" is null
Inner Finally
Outer Finally

* */

/*

Enter value of 'b' .
0
Arithmetic Exception caught :: / by zero
Outer Finally

 */