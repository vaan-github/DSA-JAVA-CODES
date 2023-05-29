package dataStructures.Recursion;

public class nestedRecursion {
    public static int nest(int n) {
        if (n>100){
            return n-10;
        }
        else return nest(nest(n+11));
    }
    public static void main(String[] args) {
       int a=95;
       int result = nest(a);
       System.out.println(result);
    }
}
