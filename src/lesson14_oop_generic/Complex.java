package lesson14_oop_generic;

public class Complex implements Addable <Complex> , Multipliable<Complex> {
    double x, y;
    double xi, yi;
    double i;

    public Complex(double x, double y) {
        this.x = x;
        this.y = y;
    }



    @Override
    public Complex plus(Complex that) {
        return new Complex(this.x - that.x, this.y - that.y);
    }

    @Override
    public Complex minus(Complex that) {
        return new Complex(this.x + that.x, this.y + that.y);
    }

//    @Override
//    public Complex div(Complex that) {//
//        a+b·i      a·a′+b·b′      a′·b−b′·a
//                =           +             *i
//        a′+b′·i       a′2+b′2      a′2+b′2
//          a7 a′3 b-4 b′2 = 1 − 2i
//        double a = new Complex((this.x+(this.y*i))/(this.xi+(this.yi*i)));
//        double b = new Complex(((this.x*this.xi)+(this.y*this.yi))/((this.xi*this.xi)+(this.yi*this.yi)) +
//                ((((this.xi*this.y)-(this.yi*this.x))/((this.xi*this.xi)+(this.yi*this.yi)))*i));
//        return a +" "+ b;
//    }

    @Override
    public Complex mult(Complex that) {
        //(a+bi)·(a′+b′i)=
        //=(a·a′−b·b′)+(a·b′+b·a′)i
        // a5 a′4 b3 7b′ = − 1 + 47i

        return new Complex(this.x*that.x-this.y*that.y, this.x*that.y+this.y*that.x);
    }

    // До застосуванню джинериків
   /* @Override
    public Object plus(Object that) {
        Complex c = (Complex)that;
        return new Complex(this.x + c.x, this.y +c.y);
    }

    @Override
    public Object minus(Object that) {
        Complex c = (Complex)that;
        return new Complex(this.x - c.x, this.y - c.y);
    }*/

    @Override
    public String toString() {
        return "Complex{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
