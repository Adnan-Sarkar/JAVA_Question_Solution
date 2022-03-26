package spring_2018;

class Student {
    private String name, id;
    private double cgpa;

    public Student(String id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public static void swap(Student a, Student b) {
        String name = a.name;
        String id = a.id;
        double cgpa = a.cgpa;

        a.name = b.name;
        a.id = b.id;
        a.cgpa = b.cgpa;

        b.name = name;
        b.id = id;
        b.cgpa = cgpa;
    }

    public String toString() {
        return this.id + " " + this.name + " " + this.cgpa;
    }

    public static void main(String[] args){
        Student s1 = new Student("011162101", "Kratos", 3.0);
        Student s2 = new Student("011162102", "Thanos", 4.0);
        System.out.println("Before swap");
        System.out.println(s1);
        System.out.println(s2);
        swap(s1, s2);
        System.out.println("After swap");
        System.out.println(s1);
        System.out.println(s2);
    }

}
