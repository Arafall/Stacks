package edu.otc;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.push(10);
        ll.push(20);
        ll.push(30);

        ll.pop();
        System.out.println(ll.inStack(10));
        ll.printList();
    }
}