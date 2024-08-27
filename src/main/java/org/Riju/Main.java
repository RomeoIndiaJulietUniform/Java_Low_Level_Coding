 package org.Riju;
 import org.Riju.LinkedList.LinkedList;


public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(20);
        ll.add(90);
        ll.add(40);
        ll.add(50);

        System.out.println("Element at index 1 is " + ll.get(1));
        System.out.println("isEmpty() " + ll.isEmpty());
        System.out.println("Get Element " + ll.get(2));

        ll.remove(1);
        System.out.println("Get Element " + ll.get(1));


    }
}
