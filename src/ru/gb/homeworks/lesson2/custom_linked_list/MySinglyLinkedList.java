package ru.gb.homeworks.lesson2.custom_linked_list;

public class MySinglyLinkedList<T> {

    private Node head;
    private Integer size = 0;

    public MySinglyLinkedList() {
    }

    public void add(T data) {
        if (head == null) {
            head = new Node(data, null);
        }
        else {
            Node tail = findTail();
            tail.next = new Node(data, null);
        }
        size++;
    }

    public Integer getSize(){
        return size;
    }

    public T get(Integer index){
        if(index == 0){
            return head.data;
        }
        if(withinSize(index)){
            return findByIndex(index).data;
        } else {
            throw new IndexOutOfBoundsException("No elements found at given index: " + index);
        }
    }

    public void delete(Integer index){
        if(withinSize(index)){
            if (index == 0) {
                head = head.next;
            } else {
                 {
                    Node toRedirectNext = findByIndex(index - 1);
                    Node toDelete = toRedirectNext.next;
                    if(toDelete.next == null){
                        toRedirectNext.next = null;
                    } else {
                        toRedirectNext.next = toDelete.next;
                    }
                }
            }
        size--;
        } else throw new IndexOutOfBoundsException("No elements found at given index: " + index);
    }

    private class Node {
        private T data;
        private Node next;

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node findTail(){
        Node cur = head;
        while(cur.next != null){
            cur = cur.next;
        }
        return cur;
    }

    private Node findByIndex(Integer index){
        Node cur = head;
        for (int i = 0; i < index; i++){
            cur = cur.next;
        }
        return cur;
    }

    private boolean withinSize(Integer index){
        return (index >= 0 && index < size);
    }
}
