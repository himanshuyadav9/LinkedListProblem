package com.bridgelabz;

public class MyNode<K>  implements INode<K>{
	private K key;
	private INode next;

	public MyNode(K key) {
		this.key = key;
		this.next = null;
	}
	public INode getNext() {
		return next;
	}
	
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	@Override
	public void setNext(INode next) {
		this.next = (MyNode<K>)next;
	}
	
	
	

}
