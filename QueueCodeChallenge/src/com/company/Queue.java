package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Queue {

    public static class Node {
        AnimalType animalType;
        Node next;

        //constructor to build nodes
        public Node(AnimalType animalType) {
            this.animalType = animalType;
        }
    }

    //initialize them as null
    private Node first = null;
    private Node last = null;

    //add Node
    public void enqueue(Node node) {

        //if empty queue, the new node is first and last
        if (last == null) {
            first = last = node;
        }
        //if not empty, the new node becomes the last node
        else {
            last.next = node;
            last = node;
        }

    }

    //remove from First (FIFO)
    public void dequeue() {
        first = first.next;
        if (first == null) {
            last = null;
        }
    }

    public void print() {
        Node node = first;
        while (node != null) {
            System.out.println(node.animalType + " ");
            //System.out.println(AnimalType.class.toString());
            node = node.next;
        }
    }



    public static void main(String[] args) {

        // write your code here
        AnimalType animalType1 = new AnimalType("cat", "garfield");
        AnimalType animalType2 = new AnimalType("dog", "clifford");
        AnimalType animalType3 = new AnimalType("dog", "scooby");


        Queue catQueue = new Queue();

        Queue dogQueue = new Queue();



        catQueue.enqueue(new Node(animalType1));
        dogQueue.enqueue(new Node(animalType2));
        dogQueue.enqueue(new Node(animalType3));

        ArrayList<Node> shelter = new ArrayList<>();
        shelter.add(catQueue.first);
        shelter.add(dogQueue.first);

       // dogQueue.dequeue();



            System.out.println("Choose 1 for Cat, 2 for Dog");
            Scanner input = new Scanner(System.in);
            int value = input.nextInt();
            Node chosen;
            if (value == 1) {
                //Node chosen;
                chosen = catQueue.first;
                catQueue.dequeue();
            }
            if (value == 2) {
                chosen = dogQueue.first;
                dogQueue.dequeue();
            } else {
               //put in the animal array and put the MIN index
                chosen = shelter.get(0);
            }
            System.out.println(chosen.animalType);







        System.out.println("Cats: ");
        catQueue.print();
        System.out.println("-----------------------------------");
        System.out.println("Dogs: ");
        dogQueue.print();
        //



    }
}




