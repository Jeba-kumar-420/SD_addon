package addon;

public class StackPop {
	int mystack[] = new int[5];
	int top=-1;
	public void push(int num) {
		if(top==4) {
			System.out.println("Stack overflow");
		}else {
			mystack[++top]=num;
		}
	}
	
	public void pop(int num) {
		mystack[top]=0;
		int popvalue=mystack[top--];
		System.out.println("Popped value:"+popvalue);
	}
		public void display() {
			for(int i=0;i<mystack.length;i++) {
				System.out.println(mystack[i]+" ");
			}
		}
			public static void main(String[] args) {
				StackPop s=new StackPop();
     			s.push(2);
     			s.push(4);
     			s.push(7);
     			s.push(14);
     			s.push(56);
     			s.display();
     			
 		    	s.pop(56);
    			s.display();
			    
	}
}

