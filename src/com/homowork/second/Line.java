package com.homowork.second;

public class Line {
    String lengthName;
    Point p1;
    Point p2;

    public Line(String lengthName, Point p1, Point p2) {
        this.lengthName = lengthName;
        this.p1 = p1;
        this.p2 = p2;
    }

    public String getLengthName() {
        return lengthName;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setLengthName(String lengthName) {
        this.lengthName = lengthName;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }
}
