package numberPrograms;

public class techNumber {
    public static void main(String[] args){
        isTechNum(20125);
    }

    private static void isTechNum(int num) {
        int digit =0;
        int xtemp=num;
        int num1=0;
        int num2=0;
        while(num>0){
            digit++;
            num=num/10;
        }
        num = xtemp;
        if(digit%2==0){
            num1 = num % (int)Math.pow(10,digit/2);
            num2 = num / (int)Math.pow(10,digit/2);
        }

        int sumOfTwoNum = num2+num1;
        int sqOfNum = sumOfTwoNum * sumOfTwoNum;
        System.out.println(sqOfNum+" sqOfNum :   : sumOfTwoNum "+sumOfTwoNum);
        if( num == sqOfNum ){
            System.out.println("This is Tech number");
        }
        else{
           System.out.println("This is not a Tech number");
        }
    }
}
