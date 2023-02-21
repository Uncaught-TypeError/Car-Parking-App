package Assignment;

public class UseStack {

    public static void main(String[] args) {
        Stack N = new Stack();
        N.push("YGN/12421");
        N.push("MDY/1064");
        N.push("KCN/4575");
        N.push("NPT/8534");
        N.push("MWT/2457");
        N.show();
        System.out.println("Car that exit parking: " + N.pop());
        N.show();
        N.push("MLM/4575");
        N.push("PGO/1235");
        N.push("KYN/1086");
        N.show();
        System.out.println("Car that come at last: " + N.peek());
        System.out.println("Cars in the parking: " + N.size());
        System.out.println("Car that exit parking: " + N.pop());
        System.out.println("Car that exit parking: " + N.pop());
        System.out.println("Car that exit parking: " + N.pop());
        System.out.println("Car that exit parking: " + N.pop());
        System.out.println("Car that exit parking: " + N.pop());
        System.out.println("Car that exit parking: " + N.pop());
        System.out.println("Cars in the parking: " + N.size());
    }

}
