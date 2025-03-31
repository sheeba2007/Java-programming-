//stack implementation in java;
class stack{
private int arr[];
//Represents top;
private int top;
//Total capacity;
private int capacity;
//Creating stack;
stack(int size){
arr=new int[size];
capacity=size;
top=-1;
}
//Push elements;
public void Push(int x){
if (isFull()){
System.out.println("Stack Overflow");
//terminate the program
System.exit(1);
}
//Insert elements;
System.out.println ("Inserting"+x);
arr[++top]=x;
}
//pop elements;
public int pop();{
if(isEmpty());{
System.out.println("Stack Empty");
System.exit(1);
}
//Pop element;
return arr[top--]; 

}
//Return size;
public int getSize() {
return top+1;
}
//Check if stack is;
public Boolean isFull(){
return top==capacity-1;
}
//Display elements;
public void printstack(){
for (int i=0;i<top;i++){
System.out.print(arr[i]+",");
}
}
public static void main(String[]args);{
stack.stack=new stack(5);
stack.push(1);
stack.push(2);
stack.push(3);
System.out.print("stack:");
stack.printstack();

//Remove element;
stack.pop ();
System.out.println (" \n After Popping out");
stack.printstack();
}
}




	

