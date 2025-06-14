package addon;

import java.util.List;

public class Stack {
	
	
	
	int mystack[] = new int[5];
	int top=-1;
	
	public void push(int num) {
		if(top==4) {
			System.out.println("Stack overflow");
		}
		else {
			mystack[++top]=num;
		}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
	}
	
	public  void display()
	{
		for(int i=0;i<mystack.length;i++)
		{
			System.out.println(mystack[i]);
		}
	}
	
			public static void main(String[] args) {
				Stack s=new Stack();
				s.push(2);
				s.push(6);
				s.push(5);
				s.push(9);
				s.push(10);
				s.push(7);
				s.push(90);
				s.push(78);
				s.display();
				
			}
			
	}
