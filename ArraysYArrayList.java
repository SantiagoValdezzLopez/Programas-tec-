import java.util.ArrayList;

public class ArraysYArrayList {
    public static void main(String[] args) {
        int[] array = new int[100];
        
        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
        }
        
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        
        for (int i = 101; i <= 200; i++) {
            arrayList1.add(i);
        }
        
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        
        for (int i = 0; i < 100; i++) {
            arrayList2.add(array[i]);
        }
        
        for (int i = 0; i < arrayList1.size(); i++) {
            arrayList2.add(arrayList1.get(i));
        }
        
        for (int i = 0; i < arrayList2.size(); i++) {
            System.out.println(arrayList2.get(i));
        }
    }
}
