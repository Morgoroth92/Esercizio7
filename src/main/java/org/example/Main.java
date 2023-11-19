package org.example;

import java.util.HashSet;

/*
    Scrivere una funzione che restituisca un hashset riempito
    Leggere l'hashSet e stampre grandezza ed elementi
 */
public class Main {
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Marco");
        hashSet.add("Luigi");
        hashSet.add("Antonio");
        printHashSet(hashSet);

    }
    public static void printHashSet(HashSet<String> hashSet) {
        System.out.println("HashSet size: " + hashSet.size());
        for (String i : hashSet) {
            System.out.println(i);
        }
    }
}