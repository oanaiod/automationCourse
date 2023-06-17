package ro.sit.homework.homework02;

public class SumOfNumbers {
    static int sum = 0;

    public static void main(String[] args) {

        for (int i = 1; i<=100; i++){
            sum += i;
        }
        System.out.println("Sum of the first 100 numbers is: " + sum);
    }

}
