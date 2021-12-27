package javaBasicPrograms;

public class RandomNumber {
    public static void main(String[] args){
        randomNumberGenerate(4);
        randomNumberWithSpesificRange(1,15);
    }

    private static void randomNumberWithSpesificRange(int min, int max) {
       int rand = (int) (Math.random() * (max - min + 1) + min);
        System.out.println("RandomNumberWithSpesificRange: "+rand);
    }

    private static void randomNumberGenerate(int i) {
        int rand = (int) (Math.random()*(Math.pow(10,i)));
        System.out.println("RandomNumberGenerate: "+ rand);
    }

}
