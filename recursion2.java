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
public static int first = -1;
public static int last = -1;
public static void findOccerence(String str, int index, char element){
    if(index == str.length()-1){
        System.out.println(first);
        System.out.println(last);
        return;
    }
    char character = str.charAt(index);
    if(character == element){
        if(first == -1){
            first = index;
        }else{
            last = index;
        }
    }
    findOccerence(str, index+1, element);
}
public static void main(String args[]){
    String str = "aabbbcccdddaannn";
    findOccerence(str, 0, 'a');
}
}
