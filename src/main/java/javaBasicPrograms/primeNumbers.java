package javaBasicPrograms;
//
public class primeNumbers {
    public static void main(String[] args) {
        printPrimeNumber(2);
    }

    // funtion for prime number
    static void printPrimeNumber(int n){
        int m = n/2;
        int flag =0;

        for(int i=2;i<=m;i++){
            if(n%i==0){
                flag=1;
            }
        }
        if(n<2){
            System.out.println(n + " This is not a prime number");
        }else{
            if(flag==1){
                System.out.println(n + " This is not a prime number");
            } else{
                System.out.println(n + " This is a prime number");
            }
        }
    }
}

