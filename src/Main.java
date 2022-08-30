import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Cat catg = new Cat();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        catg.voice();
        catg.color();
        System.out.println("Введите ваш возраст псина:");
        catg.age(reader.readLine());
        System.out.println("finish.");
        }
    }

