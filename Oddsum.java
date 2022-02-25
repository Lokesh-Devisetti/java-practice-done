import java.util.Scanner;
class Oddsum{
public static void main (String args[]){
int i,num;  
int oddSum=0,evenSum=0;
Scanner scan=new Scanner(System.in);
System.out.print("Enter the number for num:");
num=scan.nextInt();

i=1;
while(i<=num){  
if(i%2==0) 
    evenSum=evenSum+i;
else
    oddSum=oddSum+i;
 i++;
}
System.out.println("Sum of all odd numbers are: "+oddSum);
System.out.println("Sum of all even numbers are: "+evenSum);
}
}