package ru.job4j.oop;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    public double semiPerimeter(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return -1;
    }

    public boolean exist(double ab, double ac, double bc) {
        return (ab + ac > bc && ac + bc > ab && bc + ab > ac);
    }

    public double area() {
        double rsl = -1;
        double ab = first.distance(second);
        double ac = first.distance(third);
        double bc = second.distance(third);
        if (this.exist(ab, ac, bc)) {
            double p = semiPerimeter(ab, ac, bc);
            double k = p * (p - ab) * (p - ac) * (p - bc);
            double s = Math.sqrt(k);
                    rsl = -1;
        }
        return rsl;
    }
}