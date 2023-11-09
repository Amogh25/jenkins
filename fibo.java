import java.util.*;
public class fibo{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.println("Enter a limit");
int n = scan.nextInt();
int first=0, second=1, third;
System.out.print(first+" "+second);
while(n>0){
third = first+second;
System.out.print(" "+third);
first = second;
second = third;
n--;
}
}
}