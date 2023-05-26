package dataStructures.Recursion;

public class staticGlobalVariable {
    public static int withLocalVariable(int n){
        if (n>0){
            return withLocalVariable(n-1)+ n;
        }
        return 0;

    }
    static int x=0; //static variable initialization
    public static int withStaticVariable(int m){

        if(m>0){
            staticGlobalVariable.x++; //accessing static variable ('className.variableName')
            return(withStaticVariable(m-1)+staticGlobalVariable.x);

        }
        return 0;

    }

    public static void main(String[] args){
        int a =5;
        System.out.println("Local Variable "+withLocalVariable(a));

        System.out.println("first call "+withStaticVariable(a));
        System.out.println("second call "+withStaticVariable(a));

// There is an instance variable which is yet to learn.
// there is no concept of global variable in JAVA
    }
}
