package Assignment;

public class CarGatePassSys2 {

    private int ParkingSize;
    String[] Array;
    int front;
    int rear;
    int CarNum;

    public CarGatePassSys2(int c) {
        ParkingSize = c;
        Array = new String[ParkingSize];
        front = 0;
        rear = -1;
        CarNum = 0;
    }

    public boolean isEmpty() { 
        System.out.println("The parking is free still."); 
        return (CarNum == 0);
    }

    public boolean isFull() {
        return (CarNum == ParkingSize);
    }

    public void enqueue(String data) {
        if (isFull()) {
            System.out.println("The parking is full.");
        }
        if (rear == ParkingSize) {
            rear = -1;
        }
        Array[++rear] = data;
        CarNum++;
    }

    public String deQueue() {
        if (isEmpty()){
            System.out.println("The parking is ");
        }
        String car = Array[front++];
        CarNum--;
        return car;
    }

    public static void main(String[] args) {
        int CarN = 0;
        CarGatePassSys2 Car = new CarGatePassSys2(4);
        Car.enqueue("Weew");
        Car.enqueue("Weew");
        Car.enqueue("Weew");
        Car.enqueue("Weew");
        Car.enqueue("Weew");
        while (!Car.isEmpty()) {
            String car = Car.deQueue();
            System.out.println(car + "");
            CarN--;
        }
    }

}
