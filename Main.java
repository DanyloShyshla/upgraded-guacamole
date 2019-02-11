package com.company;

public class Main {

    public static void main(String[] args) {
        Saw sawFirst = new Saw("Still AKE-30 S", 1200, 8, 3, 2999);
        Saw sawSecond = new Saw();
        Saw sawThird = new Saw("Still AB-42 m", 2000, 12, 5, 6049);
        System.out.println(sawFirst);
        System.out.println(sawSecond);
        System.out.println(sawThird);

        sawSecond.printStaticSawQuontity(3);
        Saw.printStaticSawQuontity(2);

    }
}

