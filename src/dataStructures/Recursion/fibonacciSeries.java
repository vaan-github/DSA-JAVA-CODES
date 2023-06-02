        package dataStructures.Recursion;

        public class fibonacciSeries {
            public static void fibPrint(int n) {
                int firstTerm=0,secondTerm=1,nextTerm;
                System.out.println("fibonacci series for "+n+"elements: ");
                System.out.print(firstTerm+",");

                for (int i = 2; i <=n ; i++) {
                    nextTerm = firstTerm + secondTerm;
                    firstTerm = secondTerm;
                    secondTerm = nextTerm;
                    if (i==n){
                        System.out.println(nextTerm);
                    }
                    else
                        System.out.print(nextTerm+",");
                }
            }
            public static int fibLoop(int a) {
                int  t1=0,t2=1,S=0;
                if (a==1) {
                    return t1;
                }
                for (int i = 2; i <= a; i++) {
                    S = t1 + t2;
                    t1 = t2;
                    t2 = S;
                }
                return S ;
            }

            public static int fibRec(int x) {
                if (x==0){
                    return 0;
                }
                if (x==1){
                    return 1;
                }
                return fibRec(x-2)+fibRec(x-1);
            }
            static int[] A= new int[10];
            public static int fibMemo(int a) {
                if (a<=1) {
                    A[a] = a;
                    return a;
                }
                else {
                    if (A[a-2] == -1) A[a-2]=fibMemo(a-2);
                    if (A[a-1] == -1) A[a-1]=fibMemo(a-1);
                    return fibMemo(a-2)+fibMemo(a-1);
                }
            }
            public static void main(String[] args) {
                int a =5;
                System.out.println(fibRec(a));
                System.out.println(fibLoop(a));
                fibPrint(a);

                int i;
                for (i = 0; i < 10; i++) {
                    fibonacciSeries.A[i] = -1;
                }
                System.out.println(fibMemo(a));
            }
        }
