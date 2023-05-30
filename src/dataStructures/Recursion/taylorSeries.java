/*
*      TAYLOR SERIES
*  e^x = (1 * x^0)/0! + x/1! + (x * x)/2! + ......+ n-terms
*
* OBSERVATION:
* 1. ADDITION AND STATIC VARIABLE OPERATION DONE DURING RETURNING TIME .
* 2.  Let  x = power of the e
*          n = number of terms for precision
*          p = static variable for power
*          f = static variable for factorial
*          res = result
* 3. hence the taylor series is the combination of the following terms:
*          e(x,n-1) since summation is done from first term
*          Since, the recursion returns only single term we use static variable,
*                 during returning time to store value of x in p
*                 and value of n in f.
*          p = p*n;  power
*          f = f*n;  factorial
*          res = res + p/f ; now it matches the taylor series.
* */



package dataStructures.Recursion;

public class taylorSeries {
    static double pow = 1;
    static double fact = 1;

    //time ---> O(n^2) no. of multiplication in taylor series
    // Space ----> O(n) for taylorBasic1
    //Basic Taylor using recursion
    public static double taylorBasic1(double x,double n) {
        double res ;
        if (n==0){
            res = 1 ; // since the first term is 1 in taylor series
           return res;
        }
        else{
            res = taylorBasic1(x,n-1);

            // EXECUTION DURING RETURNING TIME IN RECURSION TREE
            taylorSeries.pow = taylorSeries.pow * x; // P = P * X(POWER-VARIABLE)
            taylorSeries.fact = taylorSeries.fact * n; // F = F * N(No. of terms)

            // 1 + P/F
            return res + taylorSeries.pow/taylorSeries.fact;
        }
    }

    //Basic Taylor using Iterative or Loop
    //time ---> O(n^2) no. of multiplication in taylor series
    // Space ----> O(n) for taylorBasic2
    public static double taylorBasic2(double x, double n) {
        double S = 1;
        double den = 1;
        double num = 1;
        for (int i = 1; i <=n; i++) {
             num = num * x;     // P = P * N
             den = den * i;
             S = S + num/den ;    // (S + x/n) here S = 1 ;hence (1+ x/n)

        }
        return S;
    }
    
    // Using Horner's Rule Recursion
    // Time ----> O(n) no. of multiplication in taylor series
    // Space ---> O(n)
    static double S=1;
    public static double taylorHornerRecursion(double x ,double n){
        if (n == 0) {
            return S;
        }
        else {
            S = 1 + x/n * S;
            return taylorHornerRecursion(x,n-1);
        }

    }


    // Using Horner's Rule in Iterative or Loop
    // Time ----> O(n) no. of multiplication in taylor series
    // Space ---> O(1)
    public static double taylorHornerLoop(double x , double n) {
        double S = 1;
        for (;n>0;n--) {
            S = 1 + x / n * S;
        }
        return S;
    }
    public static void main(String[] args) {
        double x = 1;
        double n = 10;
        System.out.println(taylorBasic1(x,n));
        System.out.println(taylorBasic2(x,n));
        System.out.println(taylorHornerRecursion(x,n));
        System.out.println(taylorHornerLoop(x,n));

    }
}
