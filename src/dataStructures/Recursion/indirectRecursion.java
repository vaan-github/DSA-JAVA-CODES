package dataStructures.Recursion;
public class indirectRecursion {

    public static void A(int x) {
        if (x>0){
            System.out.println(x);
            B(x-1);
        }

    }
    public static void B(int y) {
        if (y>1){
            System.out.println(y);
            A(y/2);
        }

    }
    public static void main(String[] args) {
        int a = 20;
        A(a);
    }
}
