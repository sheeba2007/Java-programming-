import java.util.Scanner;
public class calculator{

public static void main(String[]args){
Scanner scanner=new Scanner(System.in);
System.out.print("Enter the number:");
double num1=scanner.nextDouble();
System.out.print("Enter the second number:");
double num2=scanner.nextDouble();
System.out.print("Choose operation(+,-,*,/)");
char operator=scanner.next().charAt(0);
double result=0;

switch(operator){
case'+':
result=num1+num2;
System.out.println("The result is :"+result);
break;

case'-':
result=num1-num2;
System.out.println("The result is :"+result);
break;

case'*':
result=num1*num2;
System.out.println("The result is :"+result);
break;

case'/':
if (num2!=0){
result=num1/num2;
}else{
System.out.println("Invalid operation:");
return;
}
System.out.println("The result is :"+result);
}
}
}
