package javaBasicPrograms;

public class FactorialProgramRecursion {
    public static void main(String[] args){
        System.out.println(factorialFunc(5));
    }
    // factorial number function
    static int factorialFunc(int num){
        if(num==0){
            return 1;
        }
        return num * factorialFunc(num - 1);
    }
}
