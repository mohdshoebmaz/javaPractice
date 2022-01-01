package javaBasicPrograms;

public class starPattern {
    public static void main(String[] args){
        leftSideStars(5);
        rightSideStars(5);
        centerSideStars(5);
    }

    private static void centerSideStars(int n) {
        for(int j=0;j<n;j++){
            for(int k=j;k>=0;k--){
                System.out.print(" ");
            }
            for (int k=0;k>=n-j; k++){
                System.out.print("*");

            }
            System.out.println();
        }
    }

    private static void rightSideStars(int i) {
        for(int j=i-1;j>=0;j--){
            for(int x=j;x>=0;x--){
                System.out.print(" ");
            }
            for(int k=0;k<i-j;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    private static void leftSideStars(int i) {

        for(int j=i-1;j>=0;j--){
                for(int k=0;k<i-j;k++){
                    System.out.print("*");
            }
            System.out.println("");
        }
    }
}
