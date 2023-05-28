package dataStructures.Recursion;

public class treeRecursion {

    public static void fun(int x){
        if(x>0){
            System.out.print(x);
            fun(x-1);
            fun(x-1);

        }
    }
    public static void main (String[] args){
        int a =3;
        fun(a);
        System.out.println(" ");
    }
}
