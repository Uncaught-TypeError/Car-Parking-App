package Assignment;

public class UseQueue {

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue("YGN/1722");
        q.enqueue("MDY/7512");
        q.enqueue("NPT/1293");
        q.enqueue("MLM/9236");
        q.show();
        System.out.println("");
        System.out.print("Car that exit the parking: " + q.dequeue() + "\n");
        System.out.print("Car that exit the parking: " + q.dequeue() + "\n");
        q.enqueue("KYN/2345");
        q.enqueue("MWD/3028");
        q.enqueue("CHH/2145");
        q.show();
        System.out.println("");
        System.out.println("The size of the parking: " + q.getSize());
        System.out.print("Car that exit the parking: " + q.dequeue() + "\n");
        System.out.print("Car that exit the parking: " + q.dequeue() + "\n");
        System.out.print("Car that exit the parking: " + q.dequeue() + "\n");
        System.out.print("Car that exit the parking: " + q.dequeue() + "\n");
        q.show();
        System.out.println("");
        q.dequeue();
    }

}
