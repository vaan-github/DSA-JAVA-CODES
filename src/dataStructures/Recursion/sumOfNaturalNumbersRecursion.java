package dataStructures.Recursion;

public class sumOfNaturalNumbersRecursion {
    public static int sumOfNum(int y) {
        if(y>0) {
            return sumOfNum(y - 1) + y;
        }
        else return 0;
    }

    public static int sumOfNum1(int x) {
        int S = 0;
        for (int i = 1; i <=x; i++) {
            S= S + i;
        }
         return S;
    }
    public static int sumOfNum2(int n) {
        return ((n*(n+1))/2);
    }

    public static void main(String[] args) {
        int a = 5;

        int res = sumOfNum(a);
        System.out.println(res); // time O(n); Space O(n)

        int res1 = sumOfNum1(a);
        System.out.println(res1); // time O(n) Space O(1)

        int res2 = sumOfNum2(a);
        System.out.println(res2); // time O(1) Space O(1)
    }
}
