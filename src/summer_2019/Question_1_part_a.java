package summer_2019;

class Complex {
    int real, img;

    public Complex(int real, int img) {
        this.real = real;
        this.img = img;
    }

    public Complex(Complex c) {
        this.real = c.real;
        this.img = c.img;
    }
}
