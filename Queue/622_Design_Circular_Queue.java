/*
LeetCode 622 - Design Circular Queue

Problem:
Design a Circular Queue using an array that supports
enQueue, deQueue, Front, Rear, isEmpty and isFull operations.

Approach:
Use an array with front and rear pointers.
The modulo operator (%) is used to make the queue circular,
so the rear and front can wrap around to the beginning of the array.

Time Complexity:
enQueue  -> O(1)
deQueue  -> O(1)
Front    -> O(1)
Rear     -> O(1)
isEmpty  -> O(1)
isFull   -> O(1)

Space Complexity:
O(k)
*/

class MyCircularQueue {
    int arr[];
    int size;
    int rear;
    int front;

    public MyCircularQueue(int k) {

        arr = new int[k];
        size = k;
        rear = -1;
        front = -1;
    }
    
    public boolean enQueue(int value) {
        if(isFull()) {
            return false;
        } 

        if(front == -1) {
            front = 0;
        }
        rear = (rear + 1) % size;
        arr[rear] = value;

        return true;

        
    }
    
    public boolean deQueue() {
        if(isEmpty()) {
            return false;
        }


        if(rear == front) {
            rear = front = -1;
        } else {
            front = (front + 1) % size;
        }
        return true;
        
    }
    
    public int Front() {
        if(isEmpty()) {
            return -1;
        }
        return arr[front];
        
    }
    
    public int Rear() {
        if(isEmpty()) {
            return -1;
        }
        return arr[rear];
        
    }
    
    public boolean isEmpty() {
        return rear == -1 && front == -1;
        
    }
    
    public boolean isFull() {
        return (rear + 1) % size == front;
        
    }
}
