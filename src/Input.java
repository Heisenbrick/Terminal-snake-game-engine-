/*taking input so that Grid.java loop can stop */

import java.util.Scanner;
public class Input {
   ;
    public static int n=0;
    public static  volatile boolean z=true;
    
    public static void scan(){
        Scanner sc=new Scanner(System.in);
        
        
      while (z) {
         Grid.cs(); /*reset the screen */
        
         n=sc.nextInt();
         if (3==n) {
            Grid.isgameruning=false;
            
        }if (4==n) {
            Grid.isgameruning=true;
            
        }if (5==n) {
            Grid.isgameruning=false;
            z=false;
        }
            
              
            
        
       
      }sc.close();
      
    }
    
}
 /*public static void stop(int ms){
        try{
            Thread.sleep(ms);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

    }*/