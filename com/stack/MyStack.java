package com.stack;
import com.bridgelabz.INode;
import com.bridgelabz.MyLinkedList;
import com.bridgelabz.MyNode;

public class MyStack {
	public final MyLinkedList myLinkList;

	public MyStack() {
		
		this.myLinkList = new MyLinkedList();
	}

	public void push(INode myNode) {
		myLinkList.add(myNode);
	}

	public void printStack() {
		myLinkList.printMyNodes();
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Stack and Queue Problem");
		MyStack myStack = new MyStack();
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		myStack.printStack();
	}
} 
