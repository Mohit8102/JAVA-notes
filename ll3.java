import java.util.*;

public class ll3 {
    static void deleteCharFromLast(LinkedList<Integer> list, int n){
        if(list.size() == 0){
            System.out.println("Error !!");
            return;
        }

        int prevChar = list.size() - n; 
        LinkedList prev = head;
        for(int i = 1; i <= prevChar; i++){
            curr = curr.next;
        }

        prev.next = prev.next.next;
        return head;

    }
    public static void main (String args[]){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

    }
}
