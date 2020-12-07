package com.bridgelabz;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {

	@Test
	public void given3NumberWhenLinkedShouldPassLinkedListTest() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);

		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
		boolean result = myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode);
		Assert.assertTrue(result);
	}

	@Test
	public void given3NumberWhenAddedToTheLinkedListShouldBeAddedOnTop() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		boolean result = myThirdNode.getNext().equals(mySecondNode)
				&& myThirdNode.getNext().getNext().equals(myFirstNode);
		Assert.assertTrue(result);
	}
	
}
