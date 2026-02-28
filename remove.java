import java.util.LinkedList;
class remove{
	public static void main(String[]args) {
		LinkedList <Integer>l=new LinkedList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
	   System.out.println("original element:"+l);
		l.removeFirst();
		System.out.println("After remove the first element:"+l);
		l.removeLast();
		System.out.println("After remove the last element:"+l);
		l.remove(Integer.valueOf(20));
		System.out.print("After removing the element 20:"+l);
	}
}
