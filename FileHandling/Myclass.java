import java.io.*;

public class Myclass {
    public static void main(String[] args) throws Exception {
        System.out.println("File Handling in java");
        File file = new File("abc.txt");
        file.createNewFile();
        System.out.println(file.exists());
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Hello World");
        bw.close();

//        fw.write("Hello World");
//        fw.close();
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        System.out.println(br.readLine());
//        fr.read();
        fr.close();
        br.close();
    }
}
