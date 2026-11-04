import java.util.*;

public class lList {
    public static void main(){
        LinkedList<String> list = new LinkedList<String>();
        list.add("MOhit");
        list.addFirst("The");
        list.addLast("kumar");

        System.out.println(list);

        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) +"-> ");
        }
        System.out.println("null");

        list.removeFirst();
        System.out.println(list);

        list.remove(1);
        System.out.println(list);
    }
}
