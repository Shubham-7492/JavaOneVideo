import java.util.Scanner;

public class JavaFirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello_World");
//		int marks=10;
//		float averageMarks=5.1f;
//		char grade= 'd';
//		double number= 1.111111;
//		long regNumber= 17106107017l;
//		boolean isValid=true;
//		String name= "Shubham_Samrat";
//		        System.out.println(marks);
//      		System.out.println(averageMarks);
//        		System.out.println(grade);
//				System.out.println(number);	
//				System.out.println(regNumber);
//				System.out.println(name);
//				System.out.println(isValid);
				
     //operators- arithmetic, logical, assignment, bitwise*
				
//				int firstNumber=1234;
//				int secondNumber=456;
//				int sum= firstNumber+ secondNumber;
//				int div= firstNumber/ secondNumber;
//				double div1= (double)firstNumber/(double) secondNumber;  //provide quotiet
//				double div2= (double)firstNumber%(double) secondNumber;  //provide remainder
//				System.out.println(sum); 	
//				System.out.println(div); 
//				System.out.println(div1); 
//				System.out.println(div2); 
				
	 //increement and decreement*
//		        int a=17;
//		        a++; //a=a+1
//		        a--;
//		        System.out.println(a++);
//		        System.out.println(a);
		
     //taking as input*
		
//		      Scanner sc= new Scanner(System.in);
		      
//		      System.out.println("Enter your age:");
//		      System.out.println("Enter your name:");
		      
//            String name=sc.nextline();
//		      int age= sc.nextInt();
//		      int age= sc.nextFloat();
    	      
//		      System.out.println(2*age);
//		      System.out.println(name);
		
	//conditional statements*
		
//		      int age = 11;
//		      if(age>18)
//		      System.out.println("your are above eighteen ");
//		      else
//		    	  System.out.println("your are under eighteen");
		
	//conditional operators: (>,<,<=,>=,==,!=)*
	//logical operators: ( &&, ||, !)
		
//		      System.out.println(18>19);
//		      System.out.println(18<19.6);
//		      System.out.println(19!=9);
		
	//if-else statements*
		
		     //Scanner sc= new Scanner(System.in);
		     //System.out.println("Enter your grade:");
//		      char grade='A';
//		      if(grade=='A') {
//		    	  System.out.println("Excellent");
//		      }else if(grade=='B'){
//		    	  System.out.println("very good");
//		      }else if(grade=='C'){
//		    	  System.out.println("good");
//		      }else {
//		    	  System.out.println("invalid");
//		      }
		
	//switch case*
		      
//		      char grade='D';
//   	      switch(grade) {
//		      case 'A':
//		    	  System.out.println("Excellent");
//		    	  break;
//		      case 'B':	  
//		    	  System.out.println("very good");
//		    	  break;
//		      case 'C':
//		    	  System.out.println("good");
//		    	  break;
//		      default:
//		    	  System.out.println("invalid");
//		    	  break;
//		      }
		
	 //Loops(for, while, do-while)*
	 //for(;;)
		      
//		      for(int i=0;i<=10;i++) {
//		    	  System.out.println(i);
//		    	  System.out.println("hi");
//		    	  System.out.println("hello "+i);
//		      }
	 	
     // while_loop
		
//		      int n =17 ;
//		      while(true){
//		    	  System.out.println(n);
//		    	  n++;
//		    	  if(n<=100) {
//		    		  break;
//		    	  }
//		      }
		
	 //do-while loop
		
//		      int n=18;
//		      do {
//		    	  System.out.println(n);
//		    	  n++;
//		      }while(n<100);
		      
     //continue (just skip )
              
//		      int n=25;
//		      while(n<=100) {
//		    	  n++;
//		    	  if(n==65) continue;
//		    	  System.out.println(n);  
//		      }
	
	 //Array
		      
//		      int marks[]= new int[5];      //we can make any type of array here - int,float,double...
//		      marks[0]=66;
//		      marks[1]=73;
//		      marks[2]=62;
//		      marks[3]=85;
//		      marks[4]=55;
//		      int marks[]= {66,73,62,85,55};
//		      for(int i=0;i<marks.length;i++) {        // "i<=marks.length"- it shows 'out of bound'
//		    	  System.out.println(marks[i]);
//		      }
		     
	  //2D-Array
		
//		     int arr[][]= {{2,3},{4,5}};
//		     for(int i=0;i<2;i++) {
//		    	 for(int j=0;j<2;j++) {
//		    		 System.out.println("arr["+i+"]["+j+"]= "+arr[i][j]);
//          		 System.out.println("arr[0][1]= "+arr[1][0]);
//		    	 }
		             
//		     }
//		System.out.println(average(3,8));
//		System.out.println(average(7,8));
		
		
		
	//Exception Handling :try-cache
	//we can use multiple times try-catch
		
		int arr[]= new int[5];
		try {
			System.out.println(arr[7]);               //  println(2/0);
		}catch(ArrayIndexOutOfBoundsException e) {    // or catch(Exception e)
			System.out.println("Error aaya tha");
			System.out.println(e.getLocalizedMessage());
		}
		
		System.out.println("niche ki line");
		
		
	}
	
	  //methods
      //returnType functionName (arguments){}
	
//          static int average(int firstNumber,int secondNumber) {
//	        int sum= firstNumber+secondNumber;
//  	        return sum/2;
//          }
	
	 


}
