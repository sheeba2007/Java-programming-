imprt java.util.Stack;
public class postfix evaluation{
public static int evaluate postfix (String expression){
	stack<Integer>Stack=new stack<>();
	for (int i=0;i<expression.length();i++){
		char ch=expression.charAt(I);
		if(character is digit (ch)){
			stack.push(ch='0');
		}
		else{
			int operand2=stack.pop();
			int operand1=stack.pop();
			switch(ch){
				case'+';
					stack.push(operand1+operand2);
					break;
				case'-';
					stack.push(operand1-operand2);
					break;
				case'*';
					stack,push(operand1*operand2);
					break;
				case'/';
					stack.push(operand1/operand2);
					break;
			}
		}
	}
	public static void main(String[]args){
		String postfix Expression ="231*+9-";
		int result=evaluate postfix(postfix*Experssion);
		System.out.println("The result of the postfix expression\"+postfix Expresion +"|"is:"+result);
}
}

