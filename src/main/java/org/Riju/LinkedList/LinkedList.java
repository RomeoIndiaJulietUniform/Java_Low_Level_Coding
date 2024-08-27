package org.Riju.LinkedList;

public class LinkedList<E>{
    Node<E> head;
    Node<E> tail;
    int size;


    public static class Node<E>{
        E data;
        Node<E> next;

         Node(E data, Node<E> next){
            this.data = data;
            this.next = next;
        }
    }

    public LinkedList(){
        this.head = null;
        this.tail = null;
        size = 0;
    }

    public void add(E data){

        Node newNode = new Node<>(data,null);
        if(tail == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    public E get(int index){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node<E> curr = head;

        for(int i = 0 ; i < index; i++){
            curr = curr.next;
        }

        return curr.data;
    }


    public void remove(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if(index == 0) {
            head = head.next;
            if (head == null) {
                head = null;
                tail = null;
            }
        }
        else{
                Node<E> prev = head;
                for(int i = 0 ; i < index-1; i++){
                    prev = prev.next;
                }

                prev.next = prev.next.next;

                if(prev.next == null){
                    tail = prev;
                }
            }

        size--;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

}
