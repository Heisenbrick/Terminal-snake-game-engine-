public class Threads{
    public static void threads1(){
        Thread t1=new Thread(()->{
              try {
                Grid.printgrid();
              } catch (Exception e) {
                
                e.printStackTrace();
              }
        });
        Thread t2=new Thread(()->{
               
                Input.scan();
              
        });
        t2.start();
        t1.start();
    }
    
   
}
