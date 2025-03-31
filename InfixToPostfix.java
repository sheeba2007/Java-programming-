//INFIX TO POSTFIX
//Program Coding
import java.util.Stack;
public class InfixToPostfix {
public static String convert(String infix){
	Stack<Character>stack=new Stack<>();
	StringBuilder postfix=new StringBuilder();
		for(char ch:infix.toCharArray()){
			if(Character.isLetterOrDigit(ch)){
				postfix.append(ch);

				//Add operand to result
			}else if(ch=='('){
				stack.push(ch);

				//push '(' to stack
			}else if(ch==')'){
				while(stack.peek()!='('){
					postfix.append(stack.pop());
				}
				stack.pop();

				//remove'('
			}else{

				//operator
				while(!stack.isEmpty()&&precedence(stack.peek())>=precedence(ch)){
					postfix.append(stack.pop());
				}
					stack.push(ch);
			}
		}while(!stack.isEmpty()){
			postfix.append(stack.pop());
		}
			return postfix.toString();
		}
		private static int precedence(char op){
			return(op=='+'||op=='-')?1:(op=='*'||op=='/')?2:0;
		}
		public static void main(String[]args){
			String infix="a-s(a**b)/*e-f";
		System.out.println("Postfix:"+convert(infix));
		}
}

