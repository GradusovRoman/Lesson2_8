package geekbrains.lesson2_8gb;


import geekbrains.lesson2_8gb.impl.DoublyLinkedList;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        GBList list = new DoublyLinkedList();
        list.add("Воин");
        list.add("Священник");
        list.add("Охотник");
        list.add("Маг");
        list.add("Паладин");
        list.add("Разбойник");

        System.out.println(list);
        System.out.println("Изначальный размер: " + list.size() + "\n");

        System.out.println("Удаляем война...");
        System.out.println();
        list.remove("Воин");


        System.out.println("--После дуление элемента--\n" + list);
        System.out.println();
        System.out.println("Размер: " + list.size() + "\n");

        System.out.println();
        System.out.println ("Введите индекс искомого элемента:");

        Scanner sc = new Scanner(System.in);
        int ind =sc.nextInt();

        System.out.println("Элемент с индексом ["+ ind +"]:" + list.get(ind));


//        System.out.println("Элемент с индексом [0]: " + list.get(0));
//        System.out.println("Элемент с индексом [10]: " + list.get(10));
    }
}