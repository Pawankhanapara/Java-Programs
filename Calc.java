class Calc{
		static int sum(int a,int b){
		return (a+b);
		}
	
		static int sub(int a,int b){
		return (a-b);
		}

		static int mul(int a,int b){
		return (a*b);
		}

	public static void main(String args[]){

		int a =Integer.parseInt(args[0]),b=Integer.parseInt(args[1]);
		char c=args[2].charAt(0);
		
		
		if(a>=0 && b>=0){
		switch(c){
		
			case '+': System.out.println("your sum is :- \t"+sum(a,b));
				 break;
			case '-': System.out.println("your sub is :- \t"+sub(a,b));
				 break;
			case '@': System.out.println("your mull is :- \t"+mul(a,b));
				 break;
			default : System.out.println("Enter valid input");
				 break;

				
		}
		else{

		System.out.println(" Enter valid details");

		}
		

}		
}
}