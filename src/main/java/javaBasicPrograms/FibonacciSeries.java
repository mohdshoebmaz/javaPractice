package javaBasicPrograms;

class FibonacciSeries {
    public static void main(String[] args){
        long n1 = 0;
        long n2 = 1;
        System.out.print(n1 + ", " + n2);
        for(int i=2;i<=20;i++){
            long n = n1 + n2;
            System.out.print(", " + n);
            n1 = n2;
            n2 = n;
        }
    }
}
