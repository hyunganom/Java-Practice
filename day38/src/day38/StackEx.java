package day38;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack<String> s = new Stack<>();
		//1. push() : ������ ����
		s.push("apple");
		s.push("banana");
		s.push("chery");
		
		System.out.println(s);
		
		//2.pop() : top�� ������ ����
		System.out.println("pop : "+s.pop());
		System.out.println(s);
		
		//3.peek(): top�� ������ ����
		System.out.println("peek: "+s.peek());
		
		//4.search()
		System.out.println(s.search("apple"));
		System.out.println(s.search("banana"));
	}

}