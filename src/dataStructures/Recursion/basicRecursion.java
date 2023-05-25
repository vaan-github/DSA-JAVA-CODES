// from the 5. Recursion (5.Lets Code Recursion)
package dataStructures.Recursion;

public class basicRecursion {

    public static void tailRecursion(int m){
        if(m >0){
            System.out.print(m); // print during call-time (ascending in stack)
            tailRecursion(m-1);
        }

    }
    public static void headRecursion(int m){
        if (m>0){
            headRecursion(m-1);
            System.out.print(m); // print during return-time (descending in stack)
        }
    }
    public static void main(String[] args){
        int x = 3;
        System.out.println("This is tailRecursion :");
        tailRecursion(x);

        System.out.println(); //just for spacing
        System.out.println();

        System.out.println("This is headRecursion :");
        headRecursion(x);
    }
}
