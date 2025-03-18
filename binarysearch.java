import java.util.Scanner;
public class binarysearch{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int key = sc.nextInt();
        int flag = 0;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == key){
                System.out.println("Element found at position " + (mid+1));
                flag = 1;
                break;
            }
            else if(arr[mid] < key){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        if(flag == 0){
            System.out.println("Element not found");
        }
    }
}