/*
* 1st Method :
* Combination Formula is nCr = n! / r!(n-r)!
*
* 2nd Method : Pascal's Triangle [value(n,r) i.e nCr = value ]
*                                         1(n=0,r=0)
*                               1(n=1,r=0)          1(n=1,r=1)
*                     1(n=2,r=0)          2(n=2,r=1)          1(n=2,r=2)
*           1(n=3,r=0)          3(n=3,r=1)          3(n=3,r=2)          1(n=3,r=3)
* 1(n=4,r=0)          4(n=4,r=1)          6(n=4,r=2)          4(n=4,r=3)         1(n=4,r=4)
*
* Here  if r=0 then value is 1 .
*       if n==r then value is 1.
*
* For e.g.    if          3(n=3,r=1)    +      3(n=3,r=2)   =  6(n=4,r=2)
*            then          n-1,r-1      +         n-1,r     =      n,r   ----generalize term
*/

package dataStructures.Recursion;
import static dataStructures.Recursion.factorialRecursion.fact1;

public class combinationRecursion {
    public static int nCr(int n,int r) {
        int nFact = fact1(n);
        int rFact = fact1(r);
        int nrFact= fact1(n-r);
        return nFact / (rFact * nrFact);
    }
    public static int NcR(int n,int r) {
        if (r==0 || n==r){
            return 1;
        }
        else{
            return NcR(n-1,r-1) + NcR(n-1,r);
        }
    }
    public static void main(String[] args) {
       int n =4;
       int r =2;
       System.out.println(nCr(n,r));
       System.out.println(NcR(n,r));
    }
}
