package fall_2018;

class Movie {
    String name, duration;
    int year;

    public Movie(String name, int year , String duration) {
        this.name = name;
        this.year = year;
        this.duration = duration;
    }

    public void play() {
        System.out.println("Playing: " + this.name + "[" + this.year + "]");
    }

    public static void movieInfo(Movie m) {
        System.out.println("Movie Name: " + m.name + ",year: " + m.year + ",Duration: " + m.duration);
    }
}
