import java.util.ArrayList;

class removeduplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);

        ArrayList<Integer> unique = new ArrayList<Integer>();

        for (int num : list) {
            if (!unique.contains(num)) {
                unique.add(num);
            }
        }

        System.out.println("After removing duplicates: " + unique);
    }
}