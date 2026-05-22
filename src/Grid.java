import java.util.concurrent.atomic.AtomicInteger;

public class Grid {
      public static volatile  boolean isgameruning=true;
      
      
      public static int grid[][]={
 
      
      {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
      {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
      {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
      {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
      {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
      {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
      {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
      {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
      {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
      {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
      {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
      {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
      {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
      {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
      {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
      {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
      
      
   };
          public static void printgrid()throws Exception{
            
                  AtomicInteger MoveLeft=new AtomicInteger();
                  AtomicInteger MoveDown=new AtomicInteger();           
            while (Input.z) {
              
            
              while (isgameruning){
                  Thread.sleep(500);
                  cs();
                    if (1==Input.n) {
                     if (MoveLeft.get()<grid.length) {
                        MoveLeft.incrementAndGet();
                      }if (grid.length==MoveLeft.get()) {
                        MoveLeft.set(0);
                      }
                    }
                    if (2==Input.n) {
                      if (MoveDown.get()<grid[0].length) {
                      MoveDown.incrementAndGet();
                      }if (grid[0].length==MoveDown.get()) {
                      MoveDown.set(0);
                      }
                   }

                
                 
                 for(int r=0;r<16;r++){
                   
                   for( int c=0;c<16;c++){
                     if (!isgameruning || !Input.z) {
                       break;
                     }
                                
                      if (r==MoveLeft.get()&&c==MoveDown.get()) {
                        System.out.print(" X ");
                    
                      }else{
                        System.out.print(" "+grid[r][c]+" ");
                      }            
                    }
                      System.out.println();   
                  }
                  
                }
             }
            }  
            public static void cs(){
               System.err.print("\033[H\033[2j");
               System.out.flush();  

            }
}