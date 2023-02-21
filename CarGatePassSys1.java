package Assignment;

public class CarGatePassSys1 {

    private int Parkingsize;
    private String[] Carnum;//array
    private int top;

    public CarGatePassSys1(int c) {
        Parkingsize = c;
        Carnum = new String[Parkingsize];
        top = -1;
    }

    public void push(String c) {
        if(isFull()){
            System.out.println("Parking Full");
        }
        Carnum[++top] = c;
    }

    public String pop() {
        if (isEmpty()){
            System.out.println("No Car");
        }
        return Carnum[top--];
    }

    public String peek() {
        return Carnum[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == Parkingsize - 1);
    }

    public static void main(String[] args){
        CarGatePassSys1 Car = new CarGatePassSys1(5);
        Car.push("YZe134");
        Car.push("Qhw231");
        Car.push("QVbv23");
        Car.push("CVWV123");

        while (!Car.isEmpty()){
            String val = Car.pop();
            System.out.println(val);
        }
        System.out.println("");
        while(!Car.isFull()){
            String val2 = Car.pop();
            System.out.println(val2);
        }
        System.out.println("");
    }
}
