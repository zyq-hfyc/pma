package com.fengchao.pma.controller;

public class Main {
    public static void main(String[] args) {
        //System.out.println(Math.round(-1.5));
        String a = new String("hello");
        String b = a;
        String c=new String("hello");
        System.out.println(a==b);
        System.out.println(a.equals(b));
        System.out.println(a==c);
        System.out.println(a.equals(c));
        System.out.println(a.hashCode()==c.hashCode());
        System.out.println("c.hashCode is " + c.hashCode());
        System.out.println("a.hashCode is "+ a.hashCode());
    }
}
