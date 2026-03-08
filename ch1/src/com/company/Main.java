package com.company;

public class Main {
    public static void main(String args[]) {
        System.out.println("Hello World!");
        ChiChar.getUnicode('中');

    }
}

class ChiChar {
    public static void getUnicode(char ch) {
        int cod = (int)ch;
        System.out.println(ch + ": " + cod);
        System.out.println(ch + ": 0x" + String.format("%x", cod));
    }
}
