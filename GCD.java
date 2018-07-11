import java.util.Scanner;
public class GCD{
	
		static int g(int a[],int n){
						
			int d=a[0];
			for(int i=0;i<n;i++){

			    d= gcd(a[i],d);
			}
			return d;
		}
	  	 static int gcd(int r1,int r2){

      				  if (r1 == 0)
           			 return r2;
       				 return gcd(r2 % r1, r1);
		  }
		
		  public static void main(String args[]){
		 Scanner x=new Scanner(System.in);
		
		 System.out.println("how many number you want to enter  ");
       		 int n=x.nextInt();
		int a[]=new int[n];
       		for(int i=0;i<n;i++){
       		 	System.out.println("enter "+(i+1));
        		a[i]=x.nextInt();
        		}
		  System.out.println("your Gcd is :"+g(a,n));
		}

}