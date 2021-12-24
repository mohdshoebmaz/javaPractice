package javaBasicPrograms;

public class Palindrome {
    public static void main(String[] args){
        palindromeString("4040");
        palindromeNumber(4041);
    }
    //This is for string palindrome
    static void palindromeString(String str){
        String ch2 = "";

        for(int i=0;i<str.length();i++){
            ch2 = ch2 + str.charAt(str.length() - 1 - i);
        }
        if(str.equals(ch2)){
            System.out.println(ch2+", "+str+ " This is palindrome");
        }else{
            System.out.println(ch2+", "+str+ " This is not panindrome");
        }
    }
    //This is for Numbers palindrome
    static void palindromeNumber(int num){
        int numX,temp,sum=0;
        temp=num;
        while(temp>0){

            numX=temp%10;
            sum=(sum*10)+numX;
            temp=temp/10;
        }

        if(num==sum){
            System.out.println(num+", "+sum+ " This is palindrome");
        }else{
            System.out.println(num+", "+sum+ " This is not panindrome");
        }
    }
}
