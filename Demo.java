import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        //Arrays
        int [] arr = new int[3];
        arr[0] = 40;
        arr[1] = 20;
        arr[2] = 30;
        
        System.out.println("Array before sorting");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        Arrays.sort(arr);
        System.out.println("Array after sorting");
        
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
       
    }
    
}
