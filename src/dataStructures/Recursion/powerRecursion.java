package dataStructures.Recursion;

public class powerRecursion {
    public static float power(int m , int n) {
        float result;
        if (n==0){
            result = 1.0F;
        } else if (n<=0) {
            result = power(m,(n+1))*1/m;
        }
        else {
            result = power(m,(n-1))*m;
        }
        return result;
    }
    public static void main(String[] args) {
        int m = 2;
        int n = -2;
        System.out.println(power(m,n));
    }
}
