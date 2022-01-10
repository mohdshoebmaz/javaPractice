package numberPrograms;
import java.util.*;
public class SunnyNumber {
        public static void main(String args[]) {
            isSunnyNumber(80);
            sunnyNumFunc(29);
        }

    private static void sunnyNumFunc(int i) {
            int sunnyNo = i+1;
            double sqNo= Math.sqrt(sunnyNo);
            if(((Math.floor(sqNo)*Math.floor(sqNo))-sunnyNo)==0){
                System.out.println("sunnyNumFunc: The given number is a sunny number: "+sunnyNo);
            }else {
                System.out.println("sunnyNumFunc: The given number is not a sunny number.");
            }
    }

    static boolean findPerfectSquare(double num) {
            double square_root = Math.sqrt(num);
            return((square_root - Math.floor(square_root)) == 0);
        }
        static void isSunnyNumber(int N) {
            if (findPerfectSquare(N + 1)) {
                System.out.println("isSunnyNumber: The given number is a sunny number.");
            }
            else {
                System.out.println("isSunnyNumber: The given number is not a sunny number.");
            }
        }



}

