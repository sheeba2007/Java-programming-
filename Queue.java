class Node{
	int data;
	Node next;
	public Node(int data){
		this .data=data;
		this.next=null;
		}
	}
class Queue{
	Node front;
	Node rear;
	int size;
	public Queue(){
		front=rear=null;
		size=0;
	}
	public void main enqueue(int data){
		Node.newNode=new Node(dat){
			if(rear==null){
				front=rear=new Node;
			}
			else{
				rear.next=new Node;
				rear=new Node;
			}
			size++;
		}if (isEmpty()){
			throw new RuntimeException("Queue is Empty");
			}
			int data= front.data;
			front=front.next;
			if(front==null){
				rear=null;
			}
			size--;
			return data;
		}
	public Boolean isEmpty(){
		return front==null;
	}
	public int peek(){
		if(isEmpty()){
			throw new RuntimeException("Queue is Empty");
		}
		return front data;
	}
	public int size(){
		return size;
	}
 }
	public class main {
	public static void main(String []args){
		Queue queue=new Queue();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		System.out.println("Queue size:"+queue.size());
		System.out.println("Front element"+queue-peek());
		System.out.println("Dequeue element:"+queue.dequeue());
		System.out.println("Queue Size:"+queue.size());
	}
	}
		
	

			