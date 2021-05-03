package com.sapunka;

import java.util.ArrayList;
//	Crating and adding and setting elements to an array list of string, integer and double
public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> integers; // Use none primitive type call Integer which is the object of the class
        integers = new ArrayList<>();
       // ArrayList<Integer> integers1 = new ArrayList<>();
        ArrayList<String> fruits = new ArrayList<>();
        ArrayList<Double> doubles = new ArrayList<>();
        //        ADD ITEMS using the add() method
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Strawberry");
        integers.add(56);
        integers.add(5);
        integers.add(6);
        integers.add(5);
        integers.add(6);
        doubles.add(2000.45);
        doubles.add(3000.45);
        doubles.add(2000.75);
        doubles.add(6000.45);
        doubles.add(1000.465);
        // We overload the add method and
        // add grapes to the index zero, pineapple to index two of of the array list
        fruits.add(0,"Grapes");
        fruits.add(2, "Pineapple");
        // Now Strawberry is at index three is changed to mango
        fruits.set(3,"Mango");
        System.out.println("\nPRINTOUT the ARRAY of Fruits Name/String, Quantity/Integer and Price/Double");
        System.out.println("Array List of Fruit");
        System.out.println(fruits);
        System.out.println("\nArray List of Fruit Quantity");
        System.out.println(integers);
        System.out.println("\nArray List of Fruit Price in Le:");
        System.out.println(doubles);

    }
}

