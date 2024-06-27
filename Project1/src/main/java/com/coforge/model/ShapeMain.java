package com.coforge.model;

import java.awt.*;

public class ShapeMain {
    public static void main(String[] args) {
        Shape shape=new Rectangle("red",23.4f,34.5f);
        shape.area();
        shape.draw();
        shape.info();
    }
}
