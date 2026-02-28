import java.util.LinkedList;
class linkedlistadd{
	public static void main(String[]args) {
		LinkedList <Integer>l=new LinkedList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.addFirst(4);
		l.addLast(5);
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		
	}
}