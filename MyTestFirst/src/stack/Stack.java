package stack;

import java.util.EmptyStackException;

public class Stack {

	//private int value;
	private int size;
	private int[] value = new int[10];

	public boolean isEmpty() {

		if(size == 0) {
				return true;
		}else{
				return false;
		}

	}

	public int top() {

		emptyCheck();
		return value[size - 1];
	}

	private void emptyCheck() {

		System.out.println(isEmpty());

		if(isEmpty()) {
			throw new EmptyStackException();
		}

	}

	public void push(int i) {
		//this.value = i;
		//++size;
		this.value[size++] = i;
	}

	public int size() {
		return this.size;
	}

	public void pop() {
		emptyCheck();
		--size;

	}

}
