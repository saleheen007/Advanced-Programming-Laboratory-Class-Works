import java.util.Scanner;

public class Lab2{
    public static void main(String[] args){
        System.out.println("Array size:");
        Scanner mysc=new Scanner(System.in);
        int n=mysc.nextInt(); //taking array size in n
        int[] arr=new int[n];
        System.out.println("Enter array numbers:"); //taking array elements input
        for(int i=0;i<n;i++){
            arr[i]=mysc.nextInt();
        }
        System.out.println("Frequency of:");
        int f=mysc.nextInt(); //taking the desired number in f to determine its frquency
        int count=0;
        for(int i=0;i<n;i++){ //using for loop to detect frequency of f
            if(arr[i]==f){
                count++;
            }
        }
        System.out.println("Frequency of "+f+": "+count);
    } 
}      