public static boolean isShorted(int arr[], int index){
    if(index == arr.length-1){
        return true;
    }
    if(arr[index] < arr[index+1]){
        return isShorted(arr, index+1);
    }else{
        return false;
    }
}
public static void main(String args[]){
    int arr[] = {1,2,3,4,5,6,7};
    boolean ans = isShorted(arr, 0);
    System.out.println(ans);
}