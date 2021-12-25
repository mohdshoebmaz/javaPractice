package javaBasicPrograms;

public class FactorialProgramLoop {
    public static void main(String[] args){
        int fac=1,num = 5;
        for(int i=1;i<=5;i++){
            fac=fac*i;
        }
        System.out.println(num+" factorial is "+fac);
    }
}
