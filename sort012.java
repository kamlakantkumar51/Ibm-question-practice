import java.util.*;
class main{
    static void sort012(int arr[]){
        int start = 0;
        int end = arr.length-1;
        int mid = 0;
        while(mid <= end){
            if(arr[mid] == 0){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                mid++;
            }else if(arr[mid] == 1){
                mid++;
            }else{
                int temp = arr[mid];
                arr[mid] = arr[end];
                arr[end] = temp;
                end--;
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        sort012(arr);

        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
