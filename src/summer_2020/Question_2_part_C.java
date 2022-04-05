package summer_2020;

class Student {
    String name;
    double cgpa;

    public Student(String name, double cgpa) {
        this.name = name;
        this.cgpa = cgpa;
    }
}

class Test {
    public static void main(String[] args) {
        Student [] students = new Student[3];
        students[0] = new Student("Bashar", 3.78);
        students[1] = new Student("Khaled", 3.66);
        students[2] = new Student("Rafiq", 3.7);

        for (Student student : students) {
            System.out.println(student.name + " " + student.cgpa);
        }
    }
}