package edu.otc;

public class LinkedList {
    public LLNode headNode = null;

    public void push(int value) {
        LLNode temp = new LLNode(value);
        temp.next = headNode;
        headNode = temp;
    }
    public int pop() {
        int temp = 0;

        if (headNode.next == null)
           headNode = null;
        else {
           temp = headNode.data;
           headNode = headNode.next;
        }
        return temp;
    }
    public int peek() {
        //System.out.println(headNode.data);
        return headNode.data;
    }
    public boolean inStack(int _dataToFind) {
        if (headNode == null)
            return false;

        LLNode temp = headNode;
        while (temp != null) {
            if (_dataToFind == temp.data)
                return true;
            temp = temp.next;
        }
        return false;
    }
    public void printList() {
        if (headNode == null)
            return;

        LLNode temp = headNode;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
