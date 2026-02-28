import java.util.LinkedList;
class evenoddcount {
   public static void main(String []args){
	   LinkedList<Integer> l=new LinkedList<Integer>();
	   l.add(12);
	   l.add(15);
	   l.add(68);
	   l.add(24);
	   l.add(35);
	   int evencount=0;
	   int oddcount=0;
	   for(int i=0;i<l.size();i++) {
		   if(l.get(i)%2==0) {
			   evencount++;
		   }
		   else {
			   oddcount++;
		   }
	   }
	   System.out.println("evencount:"+evencount);
	   System.out.println("oddcount:"+oddcount);
   }
   }
