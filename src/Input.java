

import java.util.Scanner;
public class Input {
   ;
    public static volatile int n=0;//user input
    public static  volatile boolean z=true;//is to end the game when flase
    
   public static void scan(){
     Scanner sc=new Scanner(System.in);//taking user input 
        
           //when to puse resume or end the game
           
        while (z) {
         // String po="\033["+(20)+";"+(78)+"H";
       
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