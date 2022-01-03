package numberPrograms;

public class AutomorphicNum {
    public static void main(String args[]){
        System.out.println(Automorphic(25)?"Automorphic" : "Not Automorphic");
        System.out.println(Automorphic(13)?"Automorphic" : "Not Automorphic");
        System.out.println(Automorphic(76)?"Automorphic" : "Not Automorphic");
    }

    private static boolean Automorphic(int num) {
        int SqNum = num*num;
        while(num>0){
            if(num%10 != SqNum%10){
                return false;
            }
            SqNum = SqNum/10;
            num = num/10;
        }
        return true;
    }
}
