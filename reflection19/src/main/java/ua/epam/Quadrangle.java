package ua.epam;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * Created by irinapoliakova on 22.09.16.
 */
public class Quadrangle extends Triangle {
    private int d;
    private double diagonal; //

    public Quadrangle(){}

    public Quadrangle(int a, int b, int c, int d){
        super(a,b,c);
        this.d = d;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal() {
        this.diagonal = sqrt(pow(a,2)+pow(b,2));
    }

    @MyFirstAnn
    @Override
    public double square(){
        double p = (this.a + this.b + this.c + this.d)/2;
        System.out.println("this is child method");
        return sqrt((p-this.a)*(p-this.b)*(p-this.c)*(p-this.d));
    }

    @Override
    public String toString() {
        return "Quadrangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}'+
                "d=" + d +
                ", diagonal=" + diagonal +
                '}';
    }
}
