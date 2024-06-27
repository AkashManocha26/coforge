package com.coforge.model;

public class AbcPhone implements Phone, SmartPhone,Myphone{
    private int regNo;
    private String model;
    private float cost;

    public AbcPhone(int regNo, String model, float cost) {
        this.regNo = regNo;
        this.model = model;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "AbcPhone{" +
                "regNo=" + regNo +
                ", model='" + model + '\'' +
                ", cost=" + cost +
                '}';
    }

    public int getRegNo() {
        return regNo;
    }

    public String getModel() {
        return model;
    }

    public float getCost() {
        return cost;
    }

    @Override
    public void calendar() {
        System.out.println("abc phone has calendar facility");
    }

    @Override
    public void email() {
        System.out.println("abc phone has email facility");
    }

    @Override
    public void call() {
        System.out.println("abc phone has call facility");
    }

    @Override
    public void message() {
        System.out.println("abc phone has messaging facility");
    }

    @Override
    public void playAudiosongs() {
        System.out.println("abc phone has audio facility");
    }

    @Override
    public void playVideo() {
        System.out.println("abc phone has video facility");
    }

    @Override
    public void netSurf() {
        System.out.println("abc phone has net surf facility");
    }

    @Override
    public void payment() {
        System.out.println("abc phone has payment facility");
    }
}
