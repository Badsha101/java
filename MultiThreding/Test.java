class MyCharacter extends Thread{

  public void run(){

  for(int i = 1; i <= 10; i++){

    System.out.print(i+", ");

    }

    }

  }
    
class MyNumber extends Thread{
  public void run(){
    for(char i = 'A'; i <= 'J'; i++){
    
    System.out.print(i+ ", ");

      }

      }


  }


public class Test{

public static void main(String[] args){

 MyNumber myNumber = new MyNumber();
// Thread myThread = new Thread(myNumber);

 MyCharacter myCharacter = new MyCharacter();



 myNumber.start();
 myCharacter.start();


  }

  }



