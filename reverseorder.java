import java.util.LinkedList;
class reverseorder {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<Integer>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        System.out.print("Reverse Order: ");
        for(int i=l.size()-1;i>=0;i--) {
            System.out.print(l.get(i)+ " ");
        }
    }
}