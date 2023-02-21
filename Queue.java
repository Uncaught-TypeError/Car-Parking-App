package Assignment;

public class Queue {

    String Array[] = new String[4];
    int front, rear, size;

    public void enqueue(String data) {
        if (!isFull()) {
            Array[rear] = data;
            rear = (rear + 1) % 4;
            size++;
        } else {
            System.out.println("The Parking is full.");
        }
    }

    public String dequeue() {
        String data = Array[front];
        if (!isEmpty()) {
            front = (front + 1) % 4;
            size--;
        }
        else 
            System.out.println("The Parking is empty.");
        return data;
    }

    public int getSize() {
        return size;

    }

    public boolean isEmpty() {
        return getSize() == 0;
    }

    public boolean isFull() {
        return getSize() == 4;
    }

    public void show() {
        System.out.print("Cars in the parking: ");
        for (int i = 0; i < size; i++) {
            System.out.print(Array[(front + i) % 4] + " || ");
        }
        /* System.out.println();
        for (String n : Array) {
            System.out.print(n + " ");
        }*/
    }
}
