package com.coforge.model;

public interface Phone {
    public abstract void call();
    public static final String country="India";
}
interface Mobile{
    void call();
    void message();
    void playAudiosongs();
}
interface SmartPhone{
    void call();
    void message();
    void playAudiosongs();
    void playVideo();
    void netSurf();
    void payment();
}
interface Myphone extends Phone,Mobile,SmartPhone{
    void calendar();
    void email();
}