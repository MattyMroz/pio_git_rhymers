package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private Node last;

    private static class Node {
        private final int value;
        private Node prev;
        // TODO: brak pola next, a istnieje metoda setNext

        public Node(int i) {
            value = i;
        }

        public int getValue() {
            return value;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public void setNext(Node next) {
            // TODO: metoda nie implementuje żadnej funkcjonalności, a jest wywoływana
        }
    }

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            Node newNode = new Node(i);
            newNode.setPrev(last);
            // TODO: wywołanie metody setNext, która nic nie robi
            last.setNext(newNode);
            last = newNode;
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        // TODO: metoda zawsze zwraca false, można rozważyć usunięcie lub dodanie logiki
        return false;
    }

    public int top() {
        if (isEmpty())
            // TODO: używanie magicznej liczby -1 zamiast stałej jak w DefaultCountingOutRhymer
            return -1;
        return last.getValue();
    }

    public int pop() {
        if (isEmpty())
            // TODO: używanie magicznej liczby -1 zamiast stałej jak w DefaultCountingOutRhymer
            return -1;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}
