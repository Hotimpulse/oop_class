import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Seminar2 {
    public static void main(String[] args) {
        // try(FileReader wr = new FileReader("test.txt")) {
        //     int c;
        //     while((c=wr.read()) != -1){
        //         System.out.println((char)c);
        //     }
        // } catch (IOException e) {
        //     System.out.println(e.getMessage());
        // }

        // String pathFile = "try_catch/test.txt";
        //     try {
        //         List<String> input = Files.readAllLines(Path.of(pathFile));
        //         input.forEach(System.out::println);
        //     } catch (IOException exception) {
        //         System.err.println(exception.getMessage());
        //         System.err.println("error");
        //     }

        String pathFile = "try_catch/test.txt";
        Map<String, String> map = new HashMap<>();
        try {
        List<String> input = Files.readAllLines(Path.of(pathFile));
        for (String s : input) {
        String[] line = s.split("=");
        map.put(line[0], line[1]);
        }
        map.forEach((key, value) -> System.out.println(key + ": " + value));
        } catch (IOException exception) {
        System.err.println(exception.getMessage());
        System.err.println("error");
}
    }
}
