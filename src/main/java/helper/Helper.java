package helper;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

public class Helper {
    public static ArrayList<String> getQuestionsFromFile (String filename)
    {
         ArrayList<String> arrayList = new ArrayList<>();

        try(Stream<String> textStream  = Files.lines(Paths.get(filename), StandardCharsets.UTF_8)) {
            System.out.println("И");
            textStream.forEach(System.out::println);


        } catch (IOException e) {
            e.printStackTrace();
        }

        return arrayList;
    }
}
