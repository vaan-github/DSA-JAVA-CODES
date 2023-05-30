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

    public static double taylorBase(double x,double n) {
        double res ;
        if (n==0){
            res = 1 ; // since the first term is 1 in taylor series
           return res;
        }
        else{
            res = taylorBase(x,n-1);

            // EXECUTION DURING RETURNING TIME IN RECURSION TREE
            taylorSeries.pow = taylorSeries.pow * x; // P = P * X(POWER-VARIABLE)
            taylorSeries.fact = taylorSeries.fact * n; // F = F * N(No. of terms)

            // 1 + P/F
            return res + taylorSeries.pow/taylorSeries.fact;
        }
    }
    public static void main(String[] args) {
        double x = 1;
        double n = 10;
        System.out.println(taylorBase(x,n));

    }
}
