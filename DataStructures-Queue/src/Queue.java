
import java.util.Scanner;

public class Queue {

    int size = 5;
    Node front = null;
    Node rear = null;
    Scanner input = new Scanner(System.in);

    public void enqueu() {
        if (isFull()) {
            System.out.println("--- FULL ---");
            return;
        }
        System.out.print("data: ");
        int data = input.nextInt();
        Node yeni = new Node(data);
        if (front == null) {
            front = yeni;
        } else {
            rear.next = yeni;
        }
        rear = yeni;
        System.out.println("");

        print();
        System.out.println("---------------------------------------------------------------------");
    }

    public void dequeu() {
        int a = 1;
        if (front == null) {
            System.out.println("--- EMPTY ---");
            a = 0;
            return;

        }

        if (front == rear) {
            front = null;
            rear = null;
        } else {
            front = front.next;
        }
        System.out.println("");
        print();
        if (a == 1) {

            System.out.println("---------------------------------------------------------------------");
        }

    }

    public void print() {
        if (front == null) {
            System.out.println("--- EMPTY ---");
            return;
        }
        Node tmp = front;
        while (tmp != null) {
            System.out.print(tmp.data + " --> ");
            tmp = tmp.next;
        }
        System.out.println("");
    }

    public boolean isFull() {
        Node tmp = front;
        int a = 0;
        while (tmp != null) {
            a++;
            tmp = tmp.next;
        }
        if (a == this.size) {
            return true;
        }
        return false;
    }
}
