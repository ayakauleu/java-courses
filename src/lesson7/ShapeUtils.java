package lesson7;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

public class ShapeUtils {

    public static boolean isRectangle(Shape shape) {
        return shape instanceof Rectangle;
    }

    public static boolean isTriangle(Shape shape) {
        return shape instanceof Triangle;
    }


}
