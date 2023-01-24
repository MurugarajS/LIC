package practice;

import java.util.Scanner;

public class Amstrong_no {

	public static void main(String[] args) {
		
		           Amstrong_no obj = new Amstrong_no();
		            
		           Scanner sc = new Scanner(System.in);
		             System.out.println("Enter the number:");  
		         
                int no=  sc.nextInt();
		               obj.Amstrong1(no);
		               //  obj.Amstrong(8208);

		
		               

	}

	private void Amstrong1(int no) {
             		
	                 int copy=no;
	                 int copy1=no;
		             int count =0;
	                 int rem=0;
	                 int multi=0,arm=0;
	              
		             for(;no>0;)
		              {
		        	  count++;
		        	  no=no/10;
		              }
		             System.out.println(count);
		              
		             for(;copy>0;)	  
		        	  {
		        	  rem=copy%10;
		        	  multi = (int)Math.pow(rem, count);
		        	  arm=arm+multi;
		        
		        	  copy=copy/10;
		              }
		          
		             if(arm==copy1)
		             {
		            	 System.out.println(copy1+"---"+arm+"given num is amstrong");
		             }
		             else
		             {
		            	 System.out.println(copy1+"---"+arm+"given num is not amstrong");
		             }
		             
		
		
	}

	private void Amstrong(int no) {
		        
		           int no1=no;
		           int copy = no;
		           int rem=0;
		           int arm=0;
		           int count=0;
		           
		           System.out.println(no1);
		           
		           for(;no1>0;) {
		        	   count++;
		        	   no1=no1/10;
		           }
		           System.out.println(count);
		          
		           no1=copy;
		           
		           for(;no1>0;)
		           {
		        	   
		        	 rem=(no1%10);
		            rem=(int) (Math.pow(rem, count));
		            arm=arm+rem;
		        	 //  arm= arm+(rem*rem*rem);
		        	   no1=no1/10;
		          
		           }
		         
	
		if(copy==arm)
		{
			System.out.println(copy+"--"+arm+"--"+"given num is armstrong number");
		}				
		else
			
		{
			System.out.println(no1+"---"+arm+" --"+"given num is not amstrong number");
		}
	}

}
