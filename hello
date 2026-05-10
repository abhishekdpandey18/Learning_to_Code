import java.util.Scanner;

class StackArray {

    int stack[];
    int top;
    int size;

    // Constructor
    StackArray(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    // Push operation
    void push(int value) {

        if (top == size - 1) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            stack[top] = value;
            System.out.println(value + " pushed into stack");
        }
    }

    // Pop operation
    void pop() {

        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(stack[top] + " popped from stack");
            top--;
        }
    }

    // Display stack
    void display() {

        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Stack elements are:");

            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter stack size: ");
        int n = sc.nextInt();

        StackArray s = new StackArray(n);

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();

        s.pop();

        s.display();
    }
}