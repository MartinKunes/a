import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Random rnd = new Random();
		Scanner scr = new Scanner(System.in);
		
	int a = 0;
	
			try {
			System.out.println("1): scitani, odcitani, nasobeni a deleni celych cisel");
			System.out.println("2): scitani, odcitani, nasobeni a deleni zlomku");
			System.out.println("3): prevody mezi ciselnymi soustavami - desitkovou, dvojkovou a sestnackovou");
			System.out.print(" ");
			a = scr.nextInt();
		if  (a < 3 && a > 3)  {
		System.out.print(" zadejte nizsi cislo");	
		} 
			} catch (InputMismatchException e) {
				System.out.println("Neni cislo");
			}
			 
			
           if(a == 1 ) {
        	   System.out.println("Kolik chcete pøíkladù?");
        	 
        	   int b = scr.nextInt();
        	   for(  int i = 0; i < b; i++) {

        	   if( b == 1 || b == 2 || b == 3 || b == 4) { 
        		   int x = rnd.nextInt(20)-10;
            	   int y = rnd.nextInt(20)-10;
            	   System.out.println(x + " + " + y);
            	   int c = scr.nextInt();
            	   if( x + y == c) 	 {
            		   System.out.println(" správnì");
            	   }else  {
            		   System.out.println(" špatnì");
            	   }
           }
		
		
		
	
           if( b == 2 ||  b == 3 || b == 4 ) { 
    		   int x = rnd.nextInt(20)-10;
        	   int y = rnd.nextInt(20)-10;
        	   System.out.println(x + " - " + y);
        	   int c = scr.nextInt();
        	   if( x - y == c) 	 {
        		   System.out.println(" správnì");
        	   }else  {
        		   System.out.println(" špatnì");
        	   }
       }
           
        	   if(  b == 3 || b == 4 ) { 
        		   int x = rnd.nextInt(20)-10;
            	   int y = rnd.nextInt(20)-10;
            	   System.out.println(x + " x " + y);
            	   int c = scr.nextInt();
            	   if( x * y == c) 	 {
            		   System.out.println(" správnì");
            	   }else  {
            		   System.out.println(" špatnì");
            	   }
           }
               
           if( b == 4 ) { 
    		   int x = rnd.nextInt(20)-10;
        	   int y = rnd.nextInt(20)-10;
        	   System.out.println(x + " : " + y);
        	   int c = scr.nextInt();
        	   if( x / y == c) 	 {
        		   System.out.println(" správnì");
        	   }else  {
        		   System.out.println(" špatnì");
        		   break;
        	   }
       }
           }
	}
           
           
           if( a == 2)  { 
        	   System.out.println("Kolik chcete pøíkladù?");
          	 
        	   int b = scr.nextInt();
        	   for(  int i = 0; i < b; i++) {
        		   
        		   
         
        	   
        	   
        	   
        	   
        	   }
           }
}
}