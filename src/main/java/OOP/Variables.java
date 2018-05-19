package OOP;

public class Variables {
	
	//Instance to instance : direct
	//static to static : direct and by class name, create object of class
	//instance v. to static method : we have to create object of class
	//static v. to instance method : we have to create object of class, by class name and direct
	
	public void M1(){//instance method
		int a =10; //Local variable: if variable are declared inside the method that is local variables.
		String str="AVIG";
		System.out.println(a);
		System.out.println(str);
	
		
	}
	
	
	
	int b=20;//instance variable
	String Hyper="HYPERCITY";
	
         public void M2(){//instance method
        	 
        	 System.out.println(b);
        	 System.out.println(Hyper);
        	 
        	 
        	 System.out.println(c);
        	 System.out.println(Bigbazar);
        	 
        	 Variables t2=new Variables();
        	 System.out.println(t2.c);
        	 System.out.println(t2.Bigbazar);
        	 
        	 
        	 System.out.println(Variables.c);
        	 System.out.println(Variables.Bigbazar);
        	  
		
	     }
         
         static int c=30;
         static String Bigbazar="MoreOffers";
         
         
         public static void M3(){
        	 System.out.println(c);
        	 System.out.println(Bigbazar);
        	 
        	 System.out.println(Variables.c);
        	 System.out.println(Variables.Bigbazar);
        	 
        	 
        	 Variables t=new Variables();
        	 System.out.println("I "+t.b);
        	 System.out.println("I "+t.Hyper);
        	 
        	 Variables t3=new Variables();
        	 t3.M2();
        	 
        	 
        	 
         }
         
         
         static String v;//same for instance: null
         static int u;//same for instance: 0
	
	
	
         int k=10; //instance variable
     	static int j=20; //static variable
     	
	public static void main(String[] args) {
		
		Variables var=new Variables();
		System.out.println(var.b);
		System.out.println(var.Hyper);
		
		System.out.println(c);
		System.out.println(Bigbazar);
		System.out.println(Variables.c);
		System.out.println(Variables.Bigbazar);
		
		System.out.println(v);
		System.out.println(u);
		
		
		
		System.out.println("*****************************************");
		
		Variables t = new Variables();
		System.out.println(t.k); //10
		System.out.println(t.j); //20
		
		t.k=111; t.j=222;
		System.out.println(t.k); //111
		System.out.println(t.j); //222
		
		Variables t1 = new Variables();
		System.out.println(t1.k); //10
		System.out.println(t1.j); //222
		
		t1.j=444;
		Variables t2 = new Variables();
		System.out.println(t2.k);
		System.out.println(t2.j); //444
		
	    
		
		

		
	}

}
