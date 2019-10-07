
public class LLtest {

	
	public static void main(String args[])
	{
		LinkedList l1 = new LinkedList();
		l1.addToFront(12);
		l1.addToFront(39);
		l1.addToFront(50);
		
		
		LinkedList l2 = new LinkedList();
		l2.addToFront(34);
		l2.addToFront(55);
		l2.addToFront(30);
		l2.addToFront(450);

	
	l1.printList();
	l2.printList();
	
	System.out.println(l1.getSize()== l2.getSize());
	}
}
