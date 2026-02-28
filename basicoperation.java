import java.util.ArrayList;
class basicoperation {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(2, 99);
        list.remove(3);
        list.set(1, 100);
        if (list.contains(30))
            System.out.println("Element exists");

        System.out.println("Size: " + list.size());

        System.out.println(list);
    }
}