package numberPrograms;

public class reverseNum {
    public static void main(String[] args){
        int num = 54895;
        int rem=0;
        int reserveNum = 0;
        while(num!=0){
            rem=num%10;
            reserveNum = reserveNum*10 +rem;
            num = num/10;
            System.out.println(reserveNum);
        }
        System.out.println(reserveNum);
    }
}
