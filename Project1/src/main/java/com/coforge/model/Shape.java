package com.coforge.model;

public abstract class Shape {
    private String color;


    public String getColor() {
        return color;
    }

    abstract void draw();
    abstract void area();
    public Shape(String color) {
        this.color = color;
    }

    void info(){
        System.out.println("Shape abstract super class");
    }
}
    class Rectangle extends Shape{
        private float width;
        private float length;

        public Rectangle(String color, float width, float length) {
            super(color);
            this.width = width;
            this.length = length;
        }

        public float getWidth() {
            return width;
        }

        public float getLength() {
            return length;
        }

        @Override
        void draw() {
            System.out.println("Rectangle draws");
        }

        @Override
        void area() {
            System.out.println("Area of rectangle is "+width*length);
        }
    }

