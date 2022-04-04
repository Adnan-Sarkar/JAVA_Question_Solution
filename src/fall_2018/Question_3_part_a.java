package fall_2018;

class Grader {
    String name, id;
    int payPerAssignment;
    private int count;

    public Grader(String name, String id, int payPerAssignment) {
        this.name = name;
        this.id = id;
        this.payPerAssignment = payPerAssignment;
    }

    public void printEarnings() {
        System.out.println(this.count * this.payPerAssignment);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}