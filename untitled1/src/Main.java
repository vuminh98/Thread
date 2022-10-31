import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lists = new ArrayList<>();
        lists.add(5);
        lists.add(10);
        lists.add(15);
        lists.add(20);
        lists.add(25);
        lists.add(30);
        lists.add(35);
        int max1 = lists.get(1);
        int max2 = lists.get(1);
        for (int i = 1; i < lists.size(); i++) {
            if (max1 < lists.get(i)) {
                max1 = lists.get(i);
            }
        }
            System.out.println(max1);
    }
}