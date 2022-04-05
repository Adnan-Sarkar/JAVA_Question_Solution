package fall_2019;

class Book {
    String name;
    String author;
    Book(String n, String a){
        name=n;
        author=a;
        System.out.println("This is a book");
    }
}

class Novel extends Book{
    Novel(String a, String b){
        super(a, b);
        System.out.println(name+" is a novel");
    }
}

class TextBook extends Book{
    String edition;
    TextBook(){
        super("", "");
        System.out.println("This is a textbook");
    }
    public void setGenre(String e){
        edition=e;
    }
}

class Test {
    public static void main(String[] args){
        Novel N = new Novel("Himu Mama",
                "Humayun Ahmed");
    }
}

/*

ii.) OUTPUT:    This is a book
                Himu Mama is a novel

*/