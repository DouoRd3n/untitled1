import java.io.*;
import java.nio.Buffer;

public class Main {
    public static void main(String[] args) throws IOException {
      Cat cat = new Cat("Murka", 3, 4);
        cat.save(new FileOutputStream(new File("C:/Users/student/Documents/test.txt")));
        cat = Cat.load(new FileInputStream(new File("C:/Users/student/Documents/test.txt")));
            System.out.println(cat.toString());

    }
}
