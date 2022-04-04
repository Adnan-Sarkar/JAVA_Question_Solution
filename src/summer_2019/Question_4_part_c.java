package summer_2019;

abstract class Box {
    double width, height, depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    abstract public double volume();
}

class Cube extends Box {

    public Cube(double width, double height, double depth) {
        super(width, height, depth);
    }

    public double volume() {
        return width * depth * height;
    }
}

class DifferentShapedBox extends Box {

    public DifferentShapedBox(double width, double height, double depth) {
        super(width, height, depth);
    }

    public double volume() {
        return width * depth * height;
    }
}

/*

The main advantage of using abstract class is we can enforce his concrete class to implement the abstract method for
their way. other-wise we have to write in parent class, So repeatedly we have to override this same method in child
class. Then parent class method will be useless, in this case doing abstract class solve this problem.

*/