package javaBasicPrograms;
import java.lang.Math;
public class ArmstrongNumber {
    public static void main(String[] args){
        checkArmstrongNumber(146511208);
    }
    public static void checkArmstrongNumber(int num){
        int temp,r, digits=0,sum=0;
        temp=num;

        while(temp>0){
            temp = temp/10;
            digits++;
        }

        temp=num;
        while(num>0) {
            r = num % 10;
            sum +=  (Math.pow(r, digits));
            num = num/10;
        }
        if(sum==temp){
            System.out.println(temp + " This is armstrong Number "+ sum);
        }else{
            System.out.println(temp + " This is not armstrong Number "+ sum);
        }
    }
}
