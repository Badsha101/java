public class MyException extends Exception {
    public MyException(String msg) {
        super(msg);
    }

    public static void main(String[] args) {
        Pappu pappu = new Pappu();
        try {
            pappu.pass(27);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class Pappu{
    public static void pass(int marks) throws MyException {
        if (marks<30){
            throw new MyException("Pappu failed");
        }
    }
}


