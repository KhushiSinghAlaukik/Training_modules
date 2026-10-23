import java.io.File;
import java.util.Scanner;

class FileProcessor implements Runnable {
    public String fileName;
    public FileProcessor(String fileName) {
        this.fileName = fileName;
    }
    public void run() {
        try {
            File file = new File(fileName);
            Scanner sc = new Scanner(file);
            System.out.println("Processing: " + fileName);
            while (sc.hasNextLine()) {
                System.out.println(fileName + ": " + sc.nextLine());
            }
            sc.close();
            System.out.println("Completed: " + fileName);
        } catch (Exception e) {
            System.out.println("Error reading: " + fileName);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new FileProcessor("file1.txt"));
        Thread t2 = new Thread(new FileProcessor("file2.txt"));
        Thread t3 = new Thread(new FileProcessor("file3.txt"));
        t1.start();
        t2.start();
        t3.start();
    }
}