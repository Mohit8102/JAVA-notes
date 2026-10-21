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
public static void reversestr(String str, int index){
    if(index == 0){
        System.out.print(str.charAt(index));
        return;
    }
    System.out.print(str.charAt(index));
    reversestr(str, index-1);
}
public static void main(String arg[]){
    String str = "mohit";
    reversestr(str, str.length()-1);
}


}
