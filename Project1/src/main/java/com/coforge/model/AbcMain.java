package com.coforge.model;

public class AbcMain {
    public static void main(String[] args) {
        AbcPhone abc=new AbcPhone(786798,"samsung",12000);
        System.out.println(abc);
        abc.calendar();
        abc.call();
        abc.email();
        abc.message();
        abc.netSurf();
        abc.playAudiosongs();
        abc.playVideo();
        abc.payment();
    }
}
