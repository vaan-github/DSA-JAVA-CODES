package dataStructures.Recursion;

public class factorialRecursion {
    public static int fact(int n) {

        if (n>0){
            return fact(n-1)*n;
        }
        return 1;
    }

    public static int fact1(int n) {
        int S =1;
        for (int i = 1; i <=n; i++) {
            S = S*i;
        }
        return S;
    }
    public static void main(String[] args) {
        int a =5;
        System.out.println(fact(a));

        System.out.println(fact1(a));
    }
}
