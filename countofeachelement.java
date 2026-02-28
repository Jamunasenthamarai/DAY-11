import java.util.ArrayList;

class countofeachelement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(3);

        ArrayList<Integer> visited = new ArrayList<Integer>();

        for (int i=0;i<list.size();i++) {
            int count=1;
            if (visited.contains(list.get(i)))
                continue;
            for (int j=i+1;j<list.size();j++) {
                if(list.get(i).equals(list.get(j))) {
                    count++;
                }
            }
            visited.add(list.get(i));
            System.out.println(list.get(i) + " -> " + count);
        }
    }
}