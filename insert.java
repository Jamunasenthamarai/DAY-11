import java.util.ArrayList;

class insert {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(10);
        list.add(20);
        list.add(30);

        int position = 1;
        int value = 99;

        list.add(position, value);

        System.out.println(list);
    }
}