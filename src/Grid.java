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
   // MoveDown.set(0);
    //MoveLeft.set(0); 
     System.err.print("\033[2j\033[H");
     System.out.flush();
    
     for(int i=0;i<16;i++){
      String po="\033["+(5+i)+";"+(0)+"H";
      System.out.print(po);             
            for(int  j=0;j<16;j++){
 
              System.out.print(" O ");
                                    
            }
              System.out.println();   
        }
       // System.out.print("\033[5;2H"+"y");
                            
    while (Input.z) {
       
       
  
        while (isgameruning){

          
         // Thread.sleep(500);

          
          if (1==Input.n) {
           

            if (MoveDown.get()<grid.length) {
               
             // System.out.println("\033[20;50H");
                 String positionX1 ="\033[" + (MoveDown.get()+5)+ ";"+(MoveLeft.get()*3+2)+"H";
                 System.out.print(positionX1  +"X");
                 System.out.println("\033[20;50H");
                 if (0<MoveDown.get()) {
                  String positionXm="\033[" + (MoveDown.get()+4)+ ";"+(MoveLeft.get()*3+2 )+"H";
                    System.out.print(positionXm  +"O");
                    System.out.println("\033[20;50H");
                  // System.out.flush();
                 }
                 
                 
                // MoveDown.incrementAndGet();
               
                 Thread.sleep(500);

            }
             
          }
          //Thread.sleep(500);

          if (2==Input.n) {
            
               int r=MoveDown.get()+5;
            if (MoveLeft.get()<grid.length) {
                   String positionXi ="\033[" + (r )+ ";"+(MoveLeft.get()*3+2 )+"H";
                   System.out.print(positionXi  +"X");
                   System.out.println("\033[20;50H");
                   if (0<MoveLeft.get()) {
                    String positionXj ="\033[" + (r )+ ";"+(MoveLeft.get()*3-1 )+"H";
                    System.out.print(positionXj  +"O");
                    System.out.println("\033[20;50H");
                   }
                   
               // MoveLeft.incrementAndGet();
                Thread.sleep(500);
                
            }
             
          }if (1==Input.n) {
             if (grid.length==MoveDown.get()) {
                String positionX ="\033[" + (15+5)+ ";"+(MoveLeft.get()*3+2 )+"H";
                System.out.print(positionX  +"X");
                System.out.println("\033[20;50H");
                
                String positionXo ="\033[" + (15+4 )+ ";"+(MoveLeft.get()*3+2 )+"H";
                System.out.print(positionXo  +"O");
                System.out.println("\033[20;50H");
                MoveDown.set(0);
                Thread.sleep(500);
                System.out.print(positionX +"O");
                //System.out.print(positionX +"X");
               // String position1="\033["+( 16+5)+";"+(MoveLeft.get()*3+2);
                //System.out.print(position1+"O");
               // MoveDown.incrementAndGet(); 
            }else{
              MoveDown.incrementAndGet();
            }
          }
          
          if (2==Input.n) {
            if (grid[0].length==MoveLeft.get()) {
                 int k=MoveDown.get()+5;
                 String positionXy ="\033[" + (k )+ ";"+(16*3-1 )+"H";
                System.out.print(positionXy  +"X");
                System.out.println("\033[20;50H");
                //String positionXz ="\033[" + (r)+ ";"+(16*3-1) +"H";
                //System.out.print(positionXz  +"O");
                MoveLeft.set(0);
                Thread.sleep(500);
                System.out.print(positionXy+"O");
                System.out.println("\033[20;50H");
                

            }else{
              MoveLeft.incrementAndGet();
            }
          }
         

                  if (!isgameruning || !Input.z) { // instand puse or end 
                break;
              }
                  
                
              
             
                  
        }
    }
  }  

            
  public static void cs(){
    System.err.print("\033[H\033[2j");
    System.out.flush();  

  }

}