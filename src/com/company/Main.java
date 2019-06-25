package com.company;

import com.company.SLinkedList;

public class Main {

    public static void main(String[] args) {
        SLinkedList<String> list = new SLinkedList<String>();

        System.out.println("# - Simplesmente encadeada - #");

        list.addFirst("A");
        list.addFirst("B");
        list.addLast("C");
        list.addLast("D");
        list.addLast("E");

        System.out.println(list.get(3));
        System.out.println(list.remove(3));
        System.out.println(list.get(2));

        System.out.println("Tamanho: " + list.size());
        System.out.println("Está vazia? " + list.isEmpty());
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        list.clear();

        System.out.println("# - Duplamente encadeada - #");

        DLinkedList<String> listD = new DLinkedList<String>();

        listD.addFirst("A");
        listD.addFirst("B");

        listD.add(1, "ROD");

        listD.addLast("C");
        listD.addLast("D");

        System.out.println(listD.getFirst());

        listD.removeFirst();

        System.out.println(listD.getFirst());
        System.out.println(listD.getLast());

        listD.removeLast();

        System.out.println(listD.getLast());
        System.out.println(listD.contains("C"));
        System.out.println(listD.get(1));
        System.out.println(listD.remove(0));
        System.out.println(listD.size());
        System.out.println(listD.isEmpty());
    }

    public static void imprimirIterativo(Node node) {
        while (node != null) {
            System.out.println(node.getValue());
            node = node.getNext();
        }
    }

    public static void imprimirRecursivo(Node node) {
        if (node != null) {
            System.out.println(node.getValue());
            imprimirRecursivo(node.getNext());
        }
    }
}
