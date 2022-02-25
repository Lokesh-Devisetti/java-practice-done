import java.util.Scanner;
public class Given{
public static void main(String args[]){
      
      int arr[]={2,7,15,22,45,50,68};
      
      Scanner s=new Scanner(System.in);
      System.out.println("Enter search element");
      int key=s.nextInt();   
         int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                count++;
                break;
            }
        }
        if(count>0){
            System.out.println("Yes, the element is present in array");
        }
        else{
            System.out.println("No, Element is not found");
        }
        
           
    }
}