import java.util.*;

class StackUsingQueue {
    private Queue<Integer> q;

    public StackUsingQueue() {
        q = new LinkedList<>();
    }

    public void push(int x) {
        q.add(x);
    }

    public int pop() {
        int size = q.size();
        for (int i = 0; i < size - 1; i++) {
            q.add(q.poll());
        }
        return q.poll();
    }

    public int top() {
        int size = q.size();
        for (int i = 0; i < size - 1; i++) {
            q.add(q.poll());
        }
        int topValue = q.poll();
        q.add(topValue);
        return topValue;
    }

    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
