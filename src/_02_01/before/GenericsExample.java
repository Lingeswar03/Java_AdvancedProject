package _02_01.before;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

    public static void main(String[] args) {
        List<String> shapes =new ArrayList<>();
        shapes.add("Circle");
        System.out.println(shapes);
        String circle = (String) shapes.get(0);
        shapes.add("Rectangle");
        String rectangle =shapes.get(1);

    }
}
