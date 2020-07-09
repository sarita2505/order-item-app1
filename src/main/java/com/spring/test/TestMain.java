package com.spring.test;

public class TestMain {
    public static void main(String[] args) {
        B b = new B();
        //System.out.println(.getClass().getName());

    }


}

class A {
    public A() {
        System.out.println(this.getClass().getName());
        m1();
    }
    public void m1(){
        System.out.println("A class");
    }
}

class B extends A{
    public B() {
        System.out.println(this.getClass().getName());
        m1();
    }
    public void m1(){
        System.out.println("b class");
    }
}
