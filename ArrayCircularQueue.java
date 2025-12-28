/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DSACA2;

public class ArrayCircularQueue {
    int[] queue;
    int front, rear, size;

    public ArrayCircularQueue(int size) {
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    public void enqueue(int data) {
        if ((rear + 1) % size == front) {
            System.out.println("Queue is Full");
            return;
        }

        if (front == -1)
            front = 0;

        rear = (rear + 1) % size;
        queue[rear] = data;
    }

    public void dequeue() {
        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Deleted: " + queue[front]);

        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }
    }

    public static void main(String[] args) {
        ArrayCircularQueue cq = new ArrayCircularQueue(5);
        cq.enqueue(1);
        cq.enqueue(2);
        cq.enqueue(3);
        cq.dequeue();
        cq.dequeue();
    }
}

