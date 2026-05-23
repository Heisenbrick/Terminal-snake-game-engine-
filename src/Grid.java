import java.util.concurrent.atomic.AtomicInteger;

public class Grid {
    public static volatile  boolean isgameruning=true;//when flase game will pause
      
      
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
            
    AtomicInteger MoveLeft=new AtomicInteger();//to go left in the grid
    AtomicInteger MoveDown=new AtomicInteger();//to go down in the grid 
                            
    while (Input.z) {
              
            
        while (isgameruning){

          Thread.sleep(500);

          cs();//clearing the screen
             
          // player corrdinates update logic 
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

                
            // grid randaring     
          for(int r=0;r<16;r++){
                   
            for( int c=0;c<16;c++){

              if (!isgameruning || !Input.z) { // instand puse or end 
                break;
              }
                            
              if (r==MoveLeft.get()&&c==MoveDown.get()) { //printing x according to player position
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