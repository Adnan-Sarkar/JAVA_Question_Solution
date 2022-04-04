package fall_2018;

class Test {
    public static void main(String[] args) {
        int[] array = {1, 3, 9, 8, 13, 1, 5, 19, 15};
        int min = array[0];

        for (int x : array) {
            if (min > x) {
                min = x;
            }
        }
    }
}