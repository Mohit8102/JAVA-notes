import java.util.ArrayList; 
import java.util.Collections;

public class Arraylist {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);

        int num = list.get(0);
        System.out.println(num);

        list.add(1, 1);
        System.out.println(list);

        list.set(0, 5);
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        int size = list.size();
        System.out.println(size);

        //loop
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        //shorting
        Collections.sort(list);
        System.out.println(list);
    }
}
