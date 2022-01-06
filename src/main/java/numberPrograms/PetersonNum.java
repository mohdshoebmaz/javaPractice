package numberPrograms;

public class PetersonNum {
    public static void main(String[] args){
        System.out.println(isPetersonNum(145)?"Peterson Number":"Not Peterson Number");
    }

    private static boolean isPetersonNum(int n) {
        int sum=0;
        int numX = n;
        while(n>0){
            int temp = n%10;
           sum= sum + factorialNum(temp);
            n=n/10;
        }
        return numX==sum;
    }

    private static int factorialNum(int n) {

        if(n==0){
            return 1;
        }
        return n*factorialNum(n-1);
    }
}
