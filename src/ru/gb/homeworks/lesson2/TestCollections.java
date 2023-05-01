package ru.gb.homeworks.lesson2;

import ru.gb.homeworks.lesson2.custom_array_list.MyArrayList;
import ru.gb.homeworks.lesson2.custom_linked_list.MySinglyLinkedList;

public class TestCollections {
    public static void main(String[] args) {
        final int MORE_THAN_DEFAULT_SIZE = 17;

        MyArrayList<Double> listWithDefaultSize = new MyArrayList<>();
        Double value = 1.5;

        listWithDefaultSize.add(value);

        System.out.println(listWithDefaultSize.get(0));

        for (int i = 0; i < MORE_THAN_DEFAULT_SIZE; i++){
            listWithDefaultSize.add(value);
        }
        System.out.println(listWithDefaultSize.get(16));
        listWithDefaultSize.add(value);

        System.out.println(listWithDefaultSize.getSize());

        MyArrayList<Integer> myArrayListWithSetLength = new MyArrayList<>(5);

        for (int i = 0 ; i <= 6; i++){
            myArrayListWithSetLength.add(i);
        }
        System.out.println(myArrayListWithSetLength.getSize());
        myArrayListWithSetLength.get(6);
        //myArrayListWithSetLength.get(7); //will throw an exception

        myArrayListWithSetLength.delete(2);
        System.out.println(myArrayListWithSetLength.get(2));
        //System.out.println(myArrayListWithSetLength.get(6)); //will throw an exception

        MySinglyLinkedList<String> mySinglyLinkedList = new MySinglyLinkedList<>();

        mySinglyLinkedList.add("A");
        System.out.println(mySinglyLinkedList.get(0));
        System.out.println(mySinglyLinkedList.getSize());

        mySinglyLinkedList.add("B");
        System.out.println(mySinglyLinkedList.get(0));
        System.out.println(mySinglyLinkedList.get(1));
        System.out.println(mySinglyLinkedList.getSize());

        mySinglyLinkedList.add("C");
        System.out.println(mySinglyLinkedList.get(0));
        System.out.println(mySinglyLinkedList.get(1));
        System.out.println(mySinglyLinkedList.get(2));
        System.out.println(mySinglyLinkedList.getSize());

        mySinglyLinkedList.delete(1);
        System.out.println(mySinglyLinkedList.get(0));
        System.out.println(mySinglyLinkedList.get(1));
        System.out.println(mySinglyLinkedList.getSize());



    }
}
