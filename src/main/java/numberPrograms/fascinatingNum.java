package numberPrograms;

public class fascinatingNum {
    public static void main(String[] args){
        if(isFacinatingNum(193)){
            System.out.println("This is fascinating number");
        }else{
            System.out.println("This is not fascinating number");
        }
    }

    private static boolean isFacinatingNum(int num) {
        int num2 = num*2;
        int num3 = num*3;
        String facNum = num+""+num2+num3;
        for(int i='1';i<='9';i++){
            boolean isTure = false;
            for(int j=0;j<facNum.length();j++){
                if(facNum.charAt(j)==i){
                    isTure = true;
                }
            }
            if (!isTure){
                return false;
            }
        }
        System.out.println(facNum);

        return true;
    }
}
