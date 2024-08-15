interface StockOpe {
    void enqueue(int item);
    int dequeue();
    void display();
}

class Queue implements StockOpe {
    int[] queue = new int[5];
    int front = 0, rear = -1, size = 0;

       public void enqueue(int item) {
        if (size < queue.length) {
            rear = (rear + 1) % queue.length;
            queue[rear] = item;
            size++;
        } else {
            System.out.println("Queue Overflow");
        }
    }

        public int dequeue() {
        if (size > 0) {
            int item = queue[front];
            front = (front + 1) % queue.length;
            size--;
            return item;
        } else {
            System.out.println("Queue Underflow");
            return -1;
        }
    }

       public void display() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % queue.length] + " ");
        }
        System.out.println();
    }
}

public class Stackdps {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10); queue.enqueue(20); queue.enqueue(30);
        queue.display();
        queue.dequeue();
        queue.display();
    }
}