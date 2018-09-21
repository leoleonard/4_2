package com.homowork.second;
import static java.lang.Math.*;

public class LineCheck {
    Line longerLine(Line L1, Line L2) {
        if (length(L1) < length(L2)) {
            return L2;
        } else if (this.length(L1) > length(L2)) {
            return L1;
        } else {
            return null;
        }

    }


    public double length(Line line) {
        double length = sqrt(pow(line.getP1().getX() - line.getP2().getX(), 2) + pow(line.getP1().getY() - line.getP2().getY(), 2));
        return length;
    }
}
