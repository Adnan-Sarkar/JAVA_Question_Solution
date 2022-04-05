package fall_2019;

import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 1, 10, 19, 20, 5};

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for( int y : arr ) {
            if(x == y) {
                System.out.println("Found");
            }
            else {
                System.out.println("Not found");
            }
        }
    }
}
