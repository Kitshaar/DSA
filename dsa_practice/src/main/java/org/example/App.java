package org.example;

public class App {
    public static void main(String[] args) {
        StackWithMax max1 = new StackWithMax();

        max1.push(2);
        max1.push(8);
        max1.push(5);
        max1.push(7);
        max1.push(2);
        max1.push(3);
        max1.push(23);
        max1.push(9);
        System.out.println(max1.getMax());
        max1.pop();
        System.out.println(max1.getMax());
        max1.pop();
        System.out.println(max1.getMax());
        max1.pop();
        System.out.println(max1.getMax());
        max1.pop();
        System.out.println(max1.getMax());
        max1.pop();
        System.out.println(max1.getMax());
        max1.pop();
        System.out.println(max1.getMax());
        max1.pop();
        System.out.println(max1.getMax());
        max1.pop();

    }
}
