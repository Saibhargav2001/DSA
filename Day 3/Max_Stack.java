import java.util.ArrayList;

public class Max_Stack {
	
	static class Node{
        int val;
        int max;
        Node(int v,int m){
            this.val = v;
            this.max = m;
        }
    }
    
    static ArrayList<Node> arr= new ArrayList<>();
    static int size=0;
    static int max = Integer.MIN_VALUE;
    
    
    public static void push(int val) {
    	// If the current element we are pushing is greater than the previous maximum update the max variable
       if(val>max){
           arr.add(new Node(val,val));
           max=val;
       }
       else{
           arr.add(new Node(val,max));
       }
       size++;
    }
    
    public static void pop() {
    	//remove the top element of stack
        if(size==0){
            return ;
        }
        arr.remove(--size);    
    }
    
    public int top() {
    	// returns top of the stack 
        if(size==0){
            return -1;
        }
        return arr.get(size-1).val;
    }
    
    public static int getMax() {
        // returns the maximum value of stack 
        return arr.get(size-1).max;
    }
	public static void main(String[] args) {
		 push(1);
		 push(4);
		 push(2);
		 push(3);
		 push(5);
		 System.out.println(getMax());
		 pop();
		 System.out.println(getMax());
		 
	}

}
