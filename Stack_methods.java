package javapackage;
import java.util.Stack;
public class Stack_methods {
	public static void main(String[] args) {
		Stack s=new Stack();
s.push("vyshu");
s.push(10);
s.push('v');
s.addElement("bbb");
      
System.out.println("the actual elements in stack are...."+s);
System.out.println("deleting the last element...."+s.pop());
System.out.println("peek means seeing the last element...."+s.peek());
	}

}
