/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA;

/**
 *
 * @author Sithum
 */
class UnboundedArrayStack {
    int[] arr;
    int top;
    int size;

    UnboundedArrayStack() {
        size = 2;
        arr = new int[size];
        top = -1;
    }

    void push(int x) {
        if (top == size - 1) {
            resize(size * 2);
        }
        arr[++top] = x;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }

        int val = arr[top--];

        if (top > 0 && top == size / 4) {
            resize(size / 2);
        }
        return val;
    }

    void resize(int newSize) {
        int[] temp = new int[newSize];
        for (int i = 0; i <= top; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
        size = newSize;
    }

    public static void main(String[] args) {
        UnboundedArrayStack s = new UnboundedArrayStack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop());
    }
}

