package datastructures.queue;

import java.util.Scanner;

public class Queue {
	
	int size;
	int [] queue;
	int front, rear;

	Queue(int size){
		this.size=size;
		queue = new int[size];
		front=-1;
		rear=-1;
	}

	public boolean isEmpty(){
		if (front==-1 && rear==-1)
		return true;
		else 
			return false;
	}
	
	public boolean isFull() {
		if(rear==size-1)
			return true;
		else 
			return false;
	}
	
	void enqueue(int data){
		if(!isFull()) {
			if(isEmpty())
				front =front+1;
			rear=rear+1;
			queue[rear] = data;
			System.out.println(data+" added");
			
		}
		else
			System.out.println("Queue is full");
	}
	
	void dequeue() {
		if(!isEmpty()) {
			System.out.println(queue[front]+ " is dequed");
			for(int i = 1; i<=rear;i++) {
				queue[i-1] =queue[i];	
			}
			rear--;
		}
	}
	
	void peek() {
		System.out.println(queue[front]);
	}
	
	void print() {
		for (int i = front; i<=rear; i++) {
			System.out.println(queue[i]+" ");
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter the queue size");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		Queue q = new Queue(size);
		while(true){
			System.out.println("1. Enqueue\n2. Dequeue\n3. Peek\n4. Print\n5. Exit");
			System.out.print("Enter the choice:");
			int choice = sc.nextInt();
			switch(choice){
				case 1:
					System.out.print("Enter the number:");
					int element = sc.nextInt();
					q.enqueue(element);
					break;
				case 2:
					q.dequeue();
					break;
				case 3:
					q.peek();
					break;
				case 4:
					q.print();
					break;
				case 5:
					System.exit(0);
					break;
			}
		}
		
	}
}





