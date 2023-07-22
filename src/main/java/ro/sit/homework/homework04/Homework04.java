package ro.sit.homework.homework04;

public class Homework04 {

    public static void main(String[] args) {
//        for (int i=0; i< Integer.parseInt(args[0]); i++) {
//            for (int j = 0; j < Integer.parseInt(args[1]); j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    CornerPoints(15, 5);

    }

    public static void CornerPoints(int height, int width) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if((i== 0 && j==0) || (i== (width -1) && j==0) ||
                        (i==0 && j==(height-1)) || (i== (width -1) && j==(height-1))) {
                    System.out.print("*");
                } else {
                   System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
}
