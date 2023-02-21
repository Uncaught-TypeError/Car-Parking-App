package Assignment;

public class Stack {

    private String[] Parking = new String[5];//array
    private int gate = 0;//top -1 or 0

    public void push(String data) {
        if (gate == 5) {//Full
            System.out.println("Parking is full");
        } else {
            Parking[gate] = data;
            gate++;
        }
    }

    public String pop() {//no parameter 
        String data = null;//data input from usestack
        if (isEmpty()) {
            System.out.println("Parking is Empty");
        } else {
            gate--;//to chg top position
            data = Parking[gate]; //determine top
            Parking[gate] = null; //deleted value in array and replaced 
        }
        return data;
    }

    public String peek() {//no parameter and no incre or decrement
        String data;
        data = Parking[gate - 1];
        return data;
    }

    public int size() {
        return gate;

    }

    public boolean isEmpty() {
        return gate == 0;
    }

    public void show() {
        System.out.print("Cars in the parking: ");
        for (String n : Parking) {
            System.out.print(n + " || ");
        }
        System.out.println(" ");
    }

}
