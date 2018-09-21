package com.homowork.second;

public class LineCheckTest {

    public static void main(String[] args) {


        Point A = new Point("A", 4, 4);
        Point B = new Point("B", 6, 6);
        Point C = new Point("C", -1, -1);
        Point D = new Point("D", 3, 3);
        Line line1 = new Line("line1", A, B);
        Line line2 = new Line("line1", C, D);


        LineCheck test1 = new LineCheck();
        Line result = test1.longerLine(line1, line1);

        System.out.println("Longer line is:");
        System.out.println(result.getLengthName());
        System.out.println("based on points:");
        System.out.println(result.p1.getPointName() + " (" + result.p1.getX() + ", " + result.p1.getY() + ")");
        System.out.println(result.p2.getPointName() + " (" + result.p2.getX() + ", " + result.p2.getY() + ")");
        System.out.println("has lenght:");
        System.out.println(test1.length(result) + " cm");
    }
}
