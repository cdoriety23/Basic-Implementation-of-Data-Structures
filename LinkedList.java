
public class LinkedList {

	private Node head;
	private int size;
	
	
	public void addToFront(int data)
	{
		Node n= new Node(data);
		n.setNext(head);
		head = n;
		size++;
	}
	
	
	
	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	

public void printList()
{
	Node current= head;
	System.out.print(" Head ->");
	
	while(current != null)
	{
		System.out.print(current.getData());
		System.out.print(" -> ");
		current = current.getNext();
	}
	
	System.out.println("null");
	}



public int getSize() {
	return size;
}



public void setSize(int size) {
	this.size = size;
}
}


