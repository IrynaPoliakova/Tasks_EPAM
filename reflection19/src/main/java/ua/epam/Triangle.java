package ua.epam;
import static java.lang.Math.*;


/**
 * Created by irinapoliakova on 22.09.16.
 */


public class Triangle {
    protected int a;
    protected int b;
    protected int c;

    public Triangle(){
    }

    public Triangle(int a, int b, int c){
        if ((a == 0) || (b == 0) || (c == 0)){
            throw new IllegalArgumentException("Сторона должна быть больше 0");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @MyFirstAnn
    public double square(){
        double p = (this.a + this.b + this.c)/2;
        return sqrt(p*(p-this.a)*(p-this.b)*(p-this.c));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
