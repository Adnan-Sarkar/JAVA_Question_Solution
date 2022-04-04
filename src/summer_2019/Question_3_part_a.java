package summer_2019;

class Test {
    public static void main(String[] args) {
        int[][] array = new int[4][];
        array[0] = new int[4];
        array[1] = new int[3];
        array[2] = new int[2];
        array[3] = new int[1];

        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;
        array[0][3] = 4;

        array[1][0] = 5;
        array[1][1] = 6;
        array[1][2] = 7;

        array[2][0] = 8;
        array[2][1] = 9;

        array[3][0] = 10;
    }
}
