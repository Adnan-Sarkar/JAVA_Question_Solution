package fall_2018;

class Test {
    public static void main(String[] args) {
        int[][] array = new int[4][];
        array[0] = new int[1];
        array[1] = new int[2];
        array[2] = new int[3];
        array[3] = new int[4];

        array[0][0] = 0;

        array[1][0] = 1;
        array[1][1] = 2;

        array[2][0] = 3;
        array[2][1] = 4;
        array[2][2] = 5;

        array[3][0] = 6;
        array[3][1] = 7;
        array[3][2] = 8;
        array[3][3] = 9;
    }
}
