public class recursion2{
// public static void henoi(int n, String src, String helper, String dest){
//     if(n==1){
//         System.out.println("transfer disk "+n+" from "+src+" to "+dest);
//         return;
//     }
//     henoi( n-1, src, dest, helper);
//     System.out.println("transfer disk "+ n +" from "+ src +" to "+dest);
//     henoi( n-1, helper, src, dest);
// }
// public static void main(String arg[]){
//     int n = 3;
//     henoi(n, "S", "H", "D");
// }
//----------------------------------------------------------------------------------------------------------------------
// public static void reversestr(String str, int index){
//     if(index == 0){
//         System.out.print(str.charAt(index));
//         return;
//     }
//     System.out.print(str.charAt(index));
//     reversestr(str, index-1);
// }
// public static void main(String arg[]){
//     String str = "mohit";
//     reversestr(str, str.length()-1);
// }
//----------------------------------------------------------------------------------------------------------------------
// public static int first = -1;
// public static int last = -1;
// public static void findOccerence(String str, int index, char element){
//     if(index == str.length()-1){
//         System.out.println(first);
//         System.out.println(last);
//         return;
//     }
//     char character = str.charAt(index);
//     if(character == element){
//         if(first == -1){
//             first = index;
//         }else{
//             last = index;
//         }
//     }
//     findOccerence(str, index+1, element);
// }
// public static void main(String args[]){
//     String str = "aabbbcccdddaannn";
//     findOccerence(str, 0, 'a');
// }
//----------------------------------------------------------------------------------------------------------------------
// public static boolean isShorted(int arr[], int index){
//     if(index == arr.length-1){
//         return true;
//     }
//     if(arr[index] < arr[index+1]){
//         return isShorted(arr, index+1);
//     }else{
//         return false;
//     }
// }
// public static void main(String args[]){
//     int arr[] = {1,2,3,4,5,6,7};
//     boolean ans = isShorted(arr, 0);
//     System.out.println(ans);
// }
//----------------------------------------------------------------------------------------------------------------------
// public static int count = 0;
// public static void move(String str, int index ,char element, String newString){
//     if(index == str.length()){
//         for(int i=0; i<count; i++){
//             newString += element;
//         }
//         System.out.println(newString);
//         return;
//     };
//     char character = str.charAt(index);
//     if(character == element){
//         count++;
//         move(str, index+1, element, newString);
//     }else{
//         newString += character;
//         move(str, index+1, element, newString);
//     }
    
// }
// public static void main(String arg[]){
//     String str = "mxoxhxixt";
//     move(str, 0, 'x',"");
// }
//----------------------------------------------------------------------------------------------------------------------
// public static boolean[] map = new boolean[26];
// public static void remove(String str, int index,String newString){
//     if(index == str.length()){
//         System.out.println(newString);
//         return;
//     }
//     char currChar = str.charAt(index);
//     if(map[currChar-'a'] == true){
//         remove(str, index+1, newString);
//     }else{
//         newString += currChar;
//         map[currChar-'a'] = true;
//         remove(str, index+1, newString);
//     }
// }
// public static void main(String args[]){
//     String str = "mohitkumar";
//     remove(str, 0, "");
// }
//----------------------------------------------------------------------------------------------------------------------
// public static void subSequences(String str, int index, String newString){
//     if(index == str.length()){
//         System.out.println(newString);
//         return;
//     }
//     char currChar = str.charAt(index);
//     subSequences(str, index+1, newString+currChar);
//     subSequences(str, index+1, newString);
// }
// public static void main(String args[]){
//     String str =  "abc";
//     subSequences(str, 0, "");
// }
//----------------------------------------------------------------------------------------------------------------------
public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
public static void printCombo(String str, int index, String combination){
    if(index == str.length()){
        System.out.println(combination);
        return;
    }
    char currChar = str.charAt(index);
    String mapping = keypad[currChar - '0'];

    for(int i=0; i<mapping.length(); i++){
        printCombo(str, index+1, combination+mapping.charAt(i));
    }
}
public static void main (String args[]){
    String str = "23";
    printCombo(str, 0, "");
}
}
