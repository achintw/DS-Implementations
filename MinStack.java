class MinStack {

    private Node head;

    public boolean isEmpty() { return head == null; }

    public void push(int x) {
        if(isEmpty())
            head = new Node(x, x, null);
        else
            head = new Node(x, Math.min(x, head.min), head);
    }

    public void pop() {
        if(isEmpty()) return;
        head = head.next;
    }

    public int top() {
        if(isEmpty()) return -1;
        return head.val;
    }

    public int getMin() {
        if(isEmpty()) return -1;
        return head.min;
    }

    private class Node {
        int val;
        int min;
        Node next;

        private Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }
}