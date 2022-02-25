public class Even{
    public static void main(String args[]) {
    
    int sum=0, even=0, odd=0;
        int arr[ ]={4,5,7,3,5,8};
        for(int i=0;i<arr.length;i++){
            if (i % 2 == 0)
                even += arr[i];
            else
                odd += arr[i];
           
            
        }
        System.out.println("sum of even array is:" +even);
        System.out.println("sum of even array is:" +odd);


    }
}
       



