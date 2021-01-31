import java.io.*;

public class Cat {
    private String name;
    private int age;
    private int weight;

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void save(OutputStream wr) {
        PrintWriter writer = new PrintWriter(wr);
        if (name!=null){
            writer.println(this.name);
        }
        if (age!=0){
            writer.println(String.valueOf(this.age));
        }
        if (weight!=0){
            writer.println(String.valueOf(this.weight));
        }


        writer.flush();

    }

    public static Cat load(InputStream is) throws IOException {
        String name =null;
        int age=0;
        int weight=0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));

        name = reader.readLine();

        age = Integer.parseInt(reader.readLine());

        weight =Integer.parseInt(reader.readLine());

        return new Cat(name, age, weight);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
