package com.homowork.second;

public class Point {
    String pointName;
    int X;
    int Y;

    public Point(String pointName, int x, int y) {
        this.pointName = pointName;
        X = x;
        Y = y;
    }

    public String getPointName() {
        return pointName;
    }

    public void setPointName(String pointName) {
        this.pointName = pointName;
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }
}
