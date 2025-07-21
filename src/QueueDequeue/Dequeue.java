package QueueDequeue;



public class Dequeue {
    public static void main(String[] args) {
        Dequeue dequeue = new Dequeue(5);

        dequeue.addRear(10);
        dequeue.addRear(20);
        dequeue.addFront(5);

        System.out.println("Front item: " + dequeue.peekFront()); // 5
        System.out.println("Rear item: " + dequeue.peekRear());   // 20

        dequeue.removeFront();
        System.out.println("After removing front, new front item: " + dequeue.peekFront()); // 10

        dequeue.removeRear();
        System.out.println("After removing rear, new rear item: " + dequeue.peekRear()); // 10
    }
    private int[] arr;
    private int front;
    private int rear;
    private int capacity;
    private int size;

    public Dequeue(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.front = 0;
        this.size = 0;
        this.rear = capacity - 1; // Rear is at the end of the dequeue
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFront(int item) {
        if (isFull()) {
            throw new RuntimeException("Dequeue is full");
        }
        front = (front - 1 + capacity) % capacity; // Circular decrement
        arr[front] = item;
        size++;
    }

    public void addRear(int item) {
        if (isFull()) {
            throw new RuntimeException("Dequeue is full");
        }
        rear = (rear + 1) % capacity; // Circular increment
        arr[rear] = item;
        size++;
    }

    public int removeFront() {
        if (isEmpty()) {
            throw new RuntimeException("Dequeue is empty");
        }
        int item = arr[front];
        front = (front + 1) % capacity; // Circular increment
        size--;
        return item;
    }

    public int removeRear() {
        if (isEmpty()) {
            throw new RuntimeException("Dequeue is empty");
        }
        int item = arr[rear];
        rear = (rear - 1 + capacity) % capacity; // Circular decrement
        size--;
        return item;
    }

    public int peekFront() {
        if (isEmpty()) {
            throw new RuntimeException("Dequeue is empty");
        }
        return arr[front];
    }

    public int peekRear() {
        if (isEmpty()) {
            throw new RuntimeException("Dequeue is empty");
        }
        return arr[rear];
    }

    public int getSize() {
        return size;
    }
}
