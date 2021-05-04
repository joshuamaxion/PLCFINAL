/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
import java.util.Scanner;

public class PLCTEST7 {
	
	/*
	 So I made a small ebnf for problem 6 it goes like this 
	 <Expression> = {<method>}
	 <method> = <Object>('.')(Action)
	 
	 <Object> = Int_literal | <method>
	 
	 * 
	 * 
	 * 
	 */
 public void expression() {
	 Scanner input= new Scanner(System.in);
	 // all expressions in numb 6 are made of methods so I just have to keep going until the end of the program
	 method();
	 while(nextToken == !EOF ) {
		 lex();
		 method();
	 }
	 
	 
 }
	public void method() {
	// Parsing method = <Object>('.')(Action)
		Object();
		while( nextToken == Action || nextToken == Dot) {
			lex()
			Object();
		}
		
	}
	// parsing  <Object> = Int_literal | <method>
	public void Object() {
		if(nextToken == Int_literal) {
			lex();
		}
		else if(nextToken == LEFT_Paren) {
			lex();
			expr();
			if(nextToken == RIGHT_Paren) 
				lex();
			else
			// if not in my ebnf or parenthesis give error
				error();
			
			
		}
		
	}
}
