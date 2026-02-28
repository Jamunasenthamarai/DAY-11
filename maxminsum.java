import java.util.ArrayList;

class maxminsum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(10);
        list.add(5);
        list.add(20);
        list.add(8);

        int max = list.get(0);
        int min = list.get(0);
        int sum = 0;

        for (int num : list) {
            if (num > max) {
            	max = num;
            }
            if (num < min) {
            	min = num;
            }
            sum =sum+ num;
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Sum: " + sum);
    }
}
