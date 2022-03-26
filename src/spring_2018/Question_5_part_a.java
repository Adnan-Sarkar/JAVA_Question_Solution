package spring_2018;

class Vector2D {
    public Vector2D multiplication(double a) {
        this.x *= a;
        this.y *= a;

        return this;
    }

    public double multiplication(Vector2D a) {
        return this.x * a.x + this.y * a.y;
    }

}
