import java.util.*;

public class ll3 {

//Delete index char from last in linkedlist
    static void deleteCharFromLast(LinkedList<Integer> list, int n){
        if(list.size() == 0){
            System.out.println("Error !!");
            return;
        }

        int indexChar = list.size() - n; 
        
        list.remove(indexChar);

    }

//Check Palindrome
    static boolean checkPalindrome(LinkedList<Integer> list){
        if(list.size() == 0){
            System.out.println("Error !!");
        }
        for(int i=0; i<list.size()/2; i++){
            if(list.get(i) != list.get(list.size()-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(2);
        list.add(1);
         

        int n = sc.nextInt();
        
        deleteCharFromLast(list, n);
        System.out.println(list);

        boolean Ans = checkPalindrome(list);
        System.out.println(Ans);

    }
}