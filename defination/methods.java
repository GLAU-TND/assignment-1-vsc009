package src.defination;

import src.adt.contact;

public class methods<E> implements contact<E> {
    Node Head;
    @Override
    public void add(E item) {
        if(Head == null)
        {
            Head= newNode;
        }
        else{
            Node temp=Head;
            while(temp.next != null){
                temp=temp.next();
            }
            temp.next=newNode;
        }
    }

    @Override
    public void delete(E item) {

    }

    @Override
    public int search(E item) {
        return 0;
    }

    @Override
    public void viewall() {

    }
}
    private static class Node<E>{
    private E data;
    private Node<E> next;

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

        public E getData() {
            return data;
        }

        public Node<E> getNext() {
            return next;
        }
    }
