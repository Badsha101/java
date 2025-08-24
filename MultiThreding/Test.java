class MyNumber implements Runnable{

  public void run(){

  for(int i = 1; i <= 10; i++){

    System.out.print(i+", ");
     // Thread.yield();
     try{
          Thread.sleep(1000);
     }catch(Exception e){
      System.out.println(e);

     }
    }

    }

  }
    
class MyCharacter extends Thread{
  public void run(){
    for(char i = 'A'; i <= 'J'; i++){
    
    System.out.print(i+ ", ");
    Thread.yield();

     try{
            Thread.sleep(1000);
       }catch(Exception e){
        System.out.println(e);
 
       }

      }

      }


  }


public class Test{

public static void main(String[] args){

 MyNumber myNumber = new MyNumber();
 Thread myThread = new Thread(myNumber);

 MyCharacter myCharacter = new MyCharacter();



 myThread.start();
 myCharacter.start();


  }

  }



